package com.users.gitflow.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.users.gitflow.entities.Users;
import com.users.gitflow.repositories.RequestUsers;
import com.users.gitflow.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public ResponseEntity getAllUsers() {
        var allUsers = repository.findAll();
        return ResponseEntity.ok(allUsers);
    }

    @PostMapping
    public ResponseEntity registerUsers(@RequestBody  RequestUsers data){
        Users newUsers = new Users(data);
        repository.save(newUsers);
        return ResponseEntity.ok().build();

    }
    @PutMapping
    @Transactional
    public ResponseEntity updateUsers(@RequestBody RequestUsers data){
        Optional<Users> optionalUsers = repository.findById(data.id());
        if (optionalUsers.isPresent()) {
            Users users = optionalUsers.get();
            users.setName(data.name());
            users.setCpf(data.cpf());
            return ResponseEntity.ok(users);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable String id) {
        Optional<Users> optionalUsers = repository.findById(id);
        if (optionalUsers.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
