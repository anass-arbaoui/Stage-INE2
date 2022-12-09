package com.anass.planner.Controllers;

import com.anass.planner.entities.Ressource;
import com.anass.planner.models.JwtResponse;
import com.anass.planner.models.UserLoginRequestModel;
import com.anass.planner.repositories.ressourceRepository;
import com.anass.planner.security.SecurityConstants;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

@Controller
public class AuthenticationController {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    ressourceRepository ressourceRepos;

    @PostMapping(path = "/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody UserLoginRequestModel loginRequestModel){
        Ressource ressource = ressourceRepos.findByEmail(loginRequestModel.getEmail());

        if ( ressource!=null){
            if ( bCryptPasswordEncoder.matches(loginRequestModel.getPassword(), ressource.getPassword())) {
                String token = generateToken(loginRequestModel);

                return ResponseEntity.ok(new JwtResponse(token,
                        ressource.getId(),
                        ressource.getEmail(),
                        ressource.getRoleId()
                ));

            }
        }

        return  ResponseEntity.badRequest()
                .body("not found");


    }

    private String generateToken(UserLoginRequestModel loginRequestModel){
        String token = Jwts.builder()
                .setSubject(loginRequestModel.getEmail())
                .setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SecurityConstants.getTokenSecret())
                .compact();
        token = SecurityConstants.TOKEN_PREFIX + token;
        return token;
    }
}
