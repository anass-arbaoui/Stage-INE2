package com.anass.planner.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse {
    private String token;
    private Long id ;
    private String email;
    private Long roleId;




}
