package com.anass.planner.Services;

import com.anass.planner.entities.Team;
import com.anass.planner.repositories.teamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeamService {

    @Autowired
    teamRepository teamRepos;
/*
    public Team createTeam(Team team){
        Team save = teamRepos.save(team);
        return save;
    }
         */
       


    
}
