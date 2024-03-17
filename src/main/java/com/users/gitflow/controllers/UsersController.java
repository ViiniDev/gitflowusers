package com.users.gitflow.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.users.gitflow.entities.Users;
import com.users.gitflow.repositories.RequestUsers;
import com.users.gitflow.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {

    @GetMapping
    public ResponseEntity getAllUsers(){
        var allUsers = repository.findAll();
        return ResponseEntity.ok(allUsers);
=======
    private UserRepository repository;
    @PostMapping
    public ResponseEntity registerUsers(@RequestBody  RequestUsers data){
        Users newUsers = new Users(data);
        repository.save(newUsers);
        return ResponseEntity.ok().build();

    }

}
