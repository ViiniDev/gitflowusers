package com.users.gitflow.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {
    @GetMapping
    public ResponseEntity getAllProducts(){
        var allUsers = repository.findAll();
        return ResponseEntity.ok(allUsers);
    }

}
