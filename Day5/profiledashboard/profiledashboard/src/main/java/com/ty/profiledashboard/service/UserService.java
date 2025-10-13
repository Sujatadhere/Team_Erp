package com.ty.profiledashboard.service;

import com.ty.profiledashboard.dto.SignUpRequest;
import com.ty.profiledashboard.dto.UpdateProfileRequest;
import com.ty.profiledashboard.dto.UserProfileResponse;
import com.ty.profiledashboard.entity.Users;
import com.ty.profiledashboard.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepo;
    private final PasswordEncoder passwordEncoder;

    // ✅ Register new user
    public Users register(SignUpRequest dto) {
        if (userRepo.findByUsername(dto.getUsername()).isPresent()) {
            throw new RuntimeException("Username already exists: " + dto.getUsername());
        }

        Users user = new Users();
        user.setUsername(dto.getUsername());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setRole("ROLE_USER");

        return userRepo.save(user);
    }

    // ✅ Get logged-in user profile
    public UserProfileResponse getProfile(String username) {
        Users user = userRepo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return new UserProfileResponse(user.getId(), user.getUsername(), user.getRole());
    }

    // ✅ Update user profile
    public UserProfileResponse updateProfile(String username, UpdateProfileRequest dto) {
        Users user = userRepo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (dto.getUsername() != null && !dto.getUsername().isBlank()) {
            user.setUsername(dto.getUsername());
        }

        if (dto.getPassword() != null && !dto.getPassword().isBlank()) {
            user.setPassword(passwordEncoder.encode(dto.getPassword()));
        }

        userRepo.save(user);
        return new UserProfileResponse(user.getId(), user.getUsername(), user.getRole());
    }

    // ✅ For admin dashboard
    public List<UserProfileResponse> getAllUsers() {
        return userRepo.findAll()
                .stream()
                .map(u -> new UserProfileResponse(u.getId(), u.getUsername(), u.getRole()))
                .toList();
    }
}
