package com.MediaTracker.UserService.Services;

import com.MediaTracker.UserService.Models.User;

import java.util.Collection;
import java.util.Optional;

public interface UserService {
    public abstract Collection<User> getAllUsers();

    public abstract Optional<User> getUserById(String id);

    public abstract void newUser(User user);

    public abstract void updateUser(Long id, User user);

    public abstract void deleteUser(Long id);
}
