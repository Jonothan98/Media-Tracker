package com.MediaTracker.UserService.Controllers;

import com.MediaTracker.UserService.Models.User;
import com.MediaTracker.UserService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAll() {
        return this.userService.getUsers();
    }

}
