package com.taskplanner.repositories;

import com.taskplanner.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface roleRepository extends JpaRepository<Role, Long> {
}
