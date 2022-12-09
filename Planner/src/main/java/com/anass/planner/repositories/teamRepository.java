package com.anass.planner.repositories;

import com.anass.planner.entities.Ressource;
import com.anass.planner.entities.Task;
import com.anass.planner.entities.Team;
import com.anass.planner.models.TeamTasks;
import com.anass.planner.models.teamMembersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface teamRepository extends JpaRepository<Team, Long> {


    @Query(" select new com.anass.planner.models.TeamTasks( T.id,T.name, T.description,T.priority,  T.deadline, T.statut, TM.name)  "
            + "from Task T join Team TM on T.teamId = TM.id and TM.id = 1 ")
    public List<TeamTasks> findTeamTasks();
}
