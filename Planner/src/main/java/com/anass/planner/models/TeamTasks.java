package com.anass.planner.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
public class TeamTasks {
    public Long taskId;
    public String name;
    public String description;
    public String priority;
    public LocalDateTime deadline ;
    public String statut ;
    public String teamName;

}
