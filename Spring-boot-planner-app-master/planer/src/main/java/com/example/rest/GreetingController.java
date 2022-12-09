package com.example.rest;


import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable String name) {
        return "Hi " + name;
    }

}