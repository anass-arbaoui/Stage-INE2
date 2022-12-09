package com.taskplanner.repositories;

import com.taskplanner.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskRepository extends JpaRepository<Task, Long> {
}
