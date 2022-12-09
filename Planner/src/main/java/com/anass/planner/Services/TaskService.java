package com.anass.planner.Services;

import com.anass.planner.entities.Task;
import com.anass.planner.models.RessourceTasksModel;
import com.anass.planner.repositories.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    taskRepository taskRepos;

    public List<RessourceTasksModel> getAllTasks() {
        return taskRepos.getRessourceTasks();


    }

    public List<RessourceTasksModel> createTask(Task task){
        taskRepos.save(task);
        return taskRepos.getRessourceTasks();
    }

    public List<RessourceTasksModel> updateTask(Task task){
        Task updatedTask = taskRepos.findById(task.getId()).get();
        updatedTask.setDeadline(task.getDeadline());
        updatedTask.setDescription(task.getDescription());
        updatedTask.setName(task.getName());
        updatedTask.setPriority(task.getPriority());
        updatedTask.setStatut(task.getStatut());
        taskRepos.save(updatedTask);
        return taskRepos.getRessourceTasks();
    }
}

