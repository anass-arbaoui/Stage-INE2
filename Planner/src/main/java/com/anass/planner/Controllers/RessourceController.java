package com.anass.planner.Controllers;

import com.anass.planner.Services.RessourceServiceImpl;
import com.anass.planner.entities.Ressource;
import com.anass.planner.models.RessourceTeams;
import com.anass.planner.repositories.ressourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ressource")
public class RessourceController {
    @Autowired
    RessourceServiceImpl ressourceService;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


    @Autowired
    ressourceRepository ressourceRepos;

    @GetMapping
    public List<Ressource> getAllRessources(){
        return ressourceService.findAllressources();
    }
    @PostMapping("/sign-up")
    public Ressource registerRessource(@RequestBody Ressource ressource) throws Exception {
        if (ressourceRepos.findByEmail(ressource.getEmail()) != null) throw new Exception("user already exists");
        ressource.setPassword(bCryptPasswordEncoder.encode(ressource.getPassword()));
        return ressourceService.saveRessource(ressource);
    }
    @GetMapping("teams")
    public List<RessourceTeams> getTeams(){
        return ressourceRepos.findTeams();
    }


}

