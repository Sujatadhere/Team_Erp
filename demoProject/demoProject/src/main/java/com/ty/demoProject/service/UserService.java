package com.ty.demoProject.service;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ty.demoProject.entity.User;
import com.ty.demoProject.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    // ✅ Constructor Injection
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // ===============================
    // ✅ REGISTER NEW USER
    // ===============================
    public User register(User user) {
        // Hash password before saving
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        // Remove confirmPassword field
        user.setConfirmpassword(null);

        // Default role if not set
        if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("ROLE_USER");
        }

        return userRepository.save(user);
    }

    // ===============================
    // ✅ LOGIN
    // ===============================
    public Optional<User> login(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);

        // Compare plain password with hashed password
        if (user.isPresent() && passwordEncoder.matches(password, user.get().getPassword())) {
            return user;
        }
        return Optional.empty();
    }

    // ===============================
    // ✅ RESET PASSWORD
    // ===============================
    public boolean resetPassword(String email, String newPassword) {
        Optional<User> user = userRepository.findByEmail(email);

        if (user.isPresent()) {
            User existingUser = user.get();
            String encodedPassword = passwordEncoder.encode(newPassword);
            existingUser.setPassword(encodedPassword);
            userRepository.save(existingUser);
            return true;
        }
        return false;
    }
}
