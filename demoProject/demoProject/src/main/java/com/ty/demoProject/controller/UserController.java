package com.ty.demoProject.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.demoProject.entity.User;
import com.ty.demoProject.service.UserService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*") // Allow all origins (CORS)
public class UserController {

    @Autowired
    private UserService userService;

    // ✅ SIGN UP
    @PostMapping("/signup")
    public Map<String, Object> register(@RequestBody User user) {
        User registeredUser = userService.register(user);
        return Map.of(
            "message", "User registered successfully!",
            "username", registeredUser.getUsername(),
            "email", registeredUser.getEmail(),
            "role", registeredUser.getRole()
        );
    }

    // ✅ SIGN IN
    @PostMapping("/signin")
    public Map<String, Object> login(@RequestBody Map<String, String> data) {
        String email = data.get("email");
        String password = data.get("password");

        Optional<User> user = userService.login(email, password);

        if (user.isPresent()) {
            User u = user.get();
            return Map.of(
                "message", "Login Successful",
                "username", u.getUsername(),
                "email", u.getEmail(),
                "role", u.getRole()
            );
        } else {
            return Map.of(
                "message", "Invalid email or password!"
            );
        }
    }

    // ✅ RESET PASSWORD
    @PutMapping("/restpassword")
    public Map<String, String> resetPassword(@RequestBody Map<String, String> data) {
        boolean result = userService.resetPassword(data.get("email"), data.get("newPassword"));
        if (result) {
            return Map.of("message", "Password reset successfully!");
        } else {
            return Map.of("message", "Email not found!");
        }
    }
}
