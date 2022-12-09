package com.anass.planner.repositories;

import com.anass.planner.entities.Ressource;
import com.anass.planner.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roleRepository extends JpaRepository<Role, Long> {
}
