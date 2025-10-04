package com.example.restapidemo.controller;

import com.example.restapidemo.model.User;
import com.example.restapidemo.service.UserService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@Getter
public class UserController {
    public UserService getService() {
        return service;
    }

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getUsers() {
        return service.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.delete(id);
    }
}
