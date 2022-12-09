package com.anass.planner.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ressource")
public class Ressource {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;
        @Column(name = "first_name",
                nullable = false)
        private String firstName;
        @Column(name = "last_name", nullable = false)
        private String lastName;
        @Column(name = "email", nullable = false)
        private String email;
        @Column(name = "password", nullable = false)
        private String password;

        @Column(name = "role_id")
        private Long roleId;

        /*@Column(name = "team_id")
        private Long teamId;
        */


        @Column(name = "task_id")
        private Long taskId;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Long getRoleId() {
            return roleId;
        }

        public void setRoleId(Long roleId) {
            this.roleId = roleId;
        }
/*
        public Long getTeamId() {
            return teamId;
        }

        public void setTeamId(Long teamId) {
            this.teamId = teamId;
        }
*/
        public Long getTaskId() {
            return taskId;
        }

        public void setTaskId(Long taskId) {
            this.taskId = taskId;
        }

    }
