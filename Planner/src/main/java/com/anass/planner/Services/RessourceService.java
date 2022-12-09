package com.anass.planner.Services;

import com.anass.planner.entities.Ressource;
import com.anass.planner.models.RessourceDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface RessourceService extends UserDetailsService {
    List<Ressource> findAllressources();
    Ressource saveRessource(Ressource ressource);
    RessourceDto getRessource(String email);
}
