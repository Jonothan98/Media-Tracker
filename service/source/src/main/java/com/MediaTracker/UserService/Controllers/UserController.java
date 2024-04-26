package com.MediaTracker.UserService.Controllers;

import com.MediaTracker.UserService.Models.User;
import com.MediaTracker.UserService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    Optional<User> getUser(@PathVariable int id) {
        try {
            return userRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("Failed for find user by ID" + e.getMessage());
        }
    }

    @PostMapping("/user")
    User newUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id){
        return userRepository.findById(Math.toIntExact(id)).map(
                user -> {
                    user.setUser_name(newUser.getUser_name());
                    user.setEmail(newUser.getEmail());
                    user.setPassword(newUser.getPassword());
                    user.setImage_url(newUser.getImage_url());
                    return userRepository.save(user);
                }).orElseGet(() -> {
                    newUser.setUser_id(id);
                    return userRepository.save(newUser);
        });
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable int id){
        userRepository.deleteById(id);
    }
}
