package com.ty.demoProject.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ty.demoProject.entity.User;
import com.ty.demoProject.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return userRepository.save(user);
    }

    public Optional<User> login(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user;
        }
        return Optional.empty();
    }

    public boolean resetPassword(String email, String newPassword) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent()) {
            User existingUser = user.get();
            existingUser.setPassword(newPassword);
            userRepository.save(existingUser);
            return true;
        }
        return false;
    }
}
