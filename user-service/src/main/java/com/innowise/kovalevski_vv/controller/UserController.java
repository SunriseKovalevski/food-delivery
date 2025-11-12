package com.innowise.kovalevski_vv.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "Users list from User Service";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return "User with id: " + id;
    }
}
