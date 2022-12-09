package com.taskplanner.repositories;

import com.taskplanner.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface teamRepository extends JpaRepository<Team, Long> {
}
