package com.anass.planner.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "task")
public class Task {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "deadline", nullable = false)
    private LocalDateTime deadline;
    @Column(name = "priority", nullable = false)
    private String priority;
    @Column(name = "statut", nullable = false)
    private String statut;
    @Column(name = "teamId", nullable = false)
    private Long teamId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}
