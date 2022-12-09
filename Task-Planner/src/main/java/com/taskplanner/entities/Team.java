package com.taskplanner.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;

    //@OneToOne
    //private Ressource owner;


    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "teams")
    private Set<Ressource> members = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "team")
    private List<Task> tasks = new ArrayList<>();

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

    public Set<Ressource> getMembers() {
        return members;
    }

    public void setMembers(Set<Ressource> members) {
        this.members = members;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
