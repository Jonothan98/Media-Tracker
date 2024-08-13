package com.MediaTracker.UserService.Services;

import com.MediaTracker.UserService.Models.User;
import com.MediaTracker.UserService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(String id) {
        return userRepository.findById(Integer.valueOf(id));
    }

    @Override
    public void newUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(Long id, User newUser) {
         userRepository.findById(Math.toIntExact(id)).map(
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

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(Math.toIntExact(id));
    }
}
