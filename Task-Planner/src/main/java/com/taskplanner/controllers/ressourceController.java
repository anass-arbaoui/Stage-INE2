package com.taskplanner.controllers;

import com.taskplanner.entities.Ressource;
import com.taskplanner.repositories.ressourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/v1")
public class ressourceController {
    @Autowired
    ressourceRepository ressourceRepos;
    @PostMapping ("/ressource")
    public Ressource createRessources(@RequestBody Ressource ressource){
        return ressourceRepos.save(ressource);
    }
}
