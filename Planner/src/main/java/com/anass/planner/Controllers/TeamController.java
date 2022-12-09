package com.anass.planner.Controllers;

import com.anass.planner.Services.TeamService;
import com.anass.planner.entities.RessourceTeamRelation;
import com.anass.planner.entities.Team;
import com.anass.planner.models.TeamTasks;
import com.anass.planner.models.teamMembersModel;
import com.anass.planner.repositories.RessourceTeamRepository;
import com.anass.planner.repositories.ressourceRepository;
import com.anass.planner.repositories.teamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.anass.planner.repositories.ressourceRepository;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    TeamService teamService;
    @Autowired
    RessourceTeamRepository ressourceTeamRepository;

    @Autowired
    teamRepository teamRepos;
    @GetMapping
    public List<teamMembersModel> getMemebers(){
        return ressourceTeamRepository.findMembers();
    }

    @PostMapping
    //afficher les teams dont la ressource fait partie
    public Team createTeam(@RequestBody Team team ){
        return teamRepos.save(team);

    }

    @GetMapping("/tasks")
    public List<TeamTasks> getTasks(){
        return teamRepos.findTeamTasks();
    }
}
