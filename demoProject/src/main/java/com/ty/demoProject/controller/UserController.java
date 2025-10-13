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
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String register(@RequestBody User users) {
        userService.register(users);
        return "User Registered successfully";
    }

    @PostMapping("/signin")
    public String login(@RequestBody Map<String, String> data) {
        Optional<User> user = userService.login(data.get("email"), data.get("password"));
        return user.isPresent() ? "Login Successful" : "Invalid Credentials!";
    }

    @PutMapping("/restpassword")
    public String resetPassword(@RequestBody Map<String, String> data) {
        boolean result = userService.resetPassword(data.get("email"), data.get("newPassword"));
        return result ? "Password reset successfully!" : "Email not found!";
    }
}
