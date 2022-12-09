package com.taskplanner.repositories;

import com.taskplanner.entities.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ressourceRepository extends JpaRepository<Ressource, Long> {
}
