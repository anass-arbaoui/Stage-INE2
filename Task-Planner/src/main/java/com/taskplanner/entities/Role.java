package com.taskplanner.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "roles")
    private Set<Ressource> ressources = new HashSet<>();

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

    public Set<Ressource> getRessources() {
        return ressources;
    }

    public void setRessources(Set<Ressource> ressources) {
        this.ressources = ressources;
    }
}
