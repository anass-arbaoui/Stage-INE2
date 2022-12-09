package com.anass.planner.repositories;

import com.anass.planner.entities.Ressource;
import com.anass.planner.models.RessourceTasksModel;
import com.anass.planner.models.RessourceTeams;
import com.anass.planner.models.teamMembersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ressourceRepository extends JpaRepository<Ressource, Long> {
    @Query(" select new com.anass.planner.models.RessourceTeams( T.id,T.name)  "
            + "from Team T, RessourceTeamRelation TM where T.id = TM.teamId and TM.ressourceId = 1 ")
    public List<RessourceTeams> findTeams();


    Ressource findByEmail(String email);
}
