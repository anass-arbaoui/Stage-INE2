package com.anass.planner.Controllers;

import com.anass.planner.Services.TaskService;
import com.anass.planner.entities.Task;
import com.anass.planner.models.RessourceTasksModel;
import com.anass.planner.repositories.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {


    @Autowired
    TaskService taskService;


    @GetMapping
    //il faut ajouter userId pour afficher seulement les taches de cette ressource
    public List<RessourceTasksModel> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping
    public List<RessourceTasksModel> createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @PutMapping
    public List<RessourceTasksModel> updateTask(@RequestBody Task task){
        return taskService.updateTask(task);
    }
}