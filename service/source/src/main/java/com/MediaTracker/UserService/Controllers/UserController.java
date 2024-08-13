package com.MediaTracker.UserService.Controllers;

import com.MediaTracker.UserService.Models.User;
import com.MediaTracker.UserService.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public Collection<User> getAll() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    Optional<User> getUser(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    void newUser(@RequestBody User user) {
        userService.newUser(user);
    }

    @PutMapping("/user/{id}")
    void updateUser(@RequestBody User newUser, @PathVariable Long id) {
        userService.updateUser(id, newUser);
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
