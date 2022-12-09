package com.anass.planner.repositories;

import com.anass.planner.entities.Task;
import com.anass.planner.models.RessourceTasksModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface taskRepository extends JpaRepository<Task, Long> {

    @Query("select new com.anass.planner.models.RessourceTasksModel( T.id, T.name, T.priority, T.description, T.deadline, T.statut) from Ressource R ,RessourceTeamRelation TM ,Task T where R.id = TM.ressourceId and TM.teamId = T.teamId and R.id = 1 ")
    List<RessourceTasksModel> getRessourceTasks();



}
