package com.ty.profiledashboard.controller;

import com.ty.profiledashboard.dto.UpdateProfileRequest;
import com.ty.profiledashboard.dto.UserProfileResponse;
import com.ty.profiledashboard.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // ✅ Get logged-in user profile
    @GetMapping("/profile")
    public ResponseEntity<UserProfileResponse> getProfile() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return ResponseEntity.ok(userService.getProfile(username));
    }

    // ✅ Update user profile
    @PutMapping("/profile")
    public ResponseEntity<UserProfileResponse> updateProfile(@RequestBody UpdateProfileRequest dto) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return ResponseEntity.ok(userService.updateProfile(username, dto));
    }
}
