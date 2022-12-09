package com.anass.planner.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "team" )
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "owner_id")
    private Long ownerId;
    /*@OneToMany
    @JoinColumn(name="Reassource_id")
    private Set<Ressource> ressources;
    */










}
