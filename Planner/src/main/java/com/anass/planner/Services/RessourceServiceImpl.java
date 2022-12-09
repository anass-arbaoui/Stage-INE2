package com.anass.planner.Services;

import com.anass.planner.entities.Ressource;
import com.anass.planner.models.RessourceDto;
import com.anass.planner.repositories.ressourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RessourceServiceImpl implements RessourceService {

    @Autowired
    ressourceRepository ressourceRepos;


    public List<Ressource> findAllressources() {
        List<Ressource> ressources = ressourceRepos.findAll();
        return ressources;

    }
    public RessourceDto getRessource(String email){
        Ressource ressource = ressourceRepos.findByEmail(email);
        RessourceDto ressourceDto = new RessourceDto();
        ressourceDto.setEmail(ressource.getEmail());
        ressourceDto.setLastName(ressource.getLastName());
        ressourceDto.setFirstName(ressource.getFirstName());
        ressourceDto.setRoleId(ressource.getRoleId());
        ressourceDto.setRessourceId(ressource.getId());
        return ressourceDto;


    }

    public Ressource saveRessource(Ressource ressource) {
        return ressourceRepos.save(ressource);

    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Ressource userEntity = ressourceRepos.findByEmail(email);
        if (userEntity == null) throw new UsernameNotFoundException(email);

        return new User(userEntity.getEmail(),userEntity.getPassword(),
                true, true,
                true, true, new ArrayList<>());
    }
}
