package com.anass.planner.repositories;

import com.anass.planner.entities.RessourceTeamRelation;
import com.anass.planner.models.teamMembersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RessourceTeamRepository extends JpaRepository<RessourceTeamRelation, Long> {
    @Query("select new com.anass.planner.models.teamMembersModel(R.firstName, R.lastName, R.email) " +
            "from Ressource R, RessourceTeamRelation T where R.id = T.ressourceId and T.teamId = 1 ")


    public List<teamMembersModel> findMembers();
}
