package com.ty.profiledashboard.controller;

import com.ty.profiledashboard.dto.SignInRequest;
import com.ty.profiledashboard.dto.SignUpRequest;
import com.ty.profiledashboard.security.JwtService;
import com.ty.profiledashboard.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    private final AuthenticationManager authManager;
    private final JwtService jwtService;

    // ✅ Register new user
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignUpRequest dto) {
        userService.register(dto);
        return ResponseEntity.ok("User registered successfully");
    }

    // ✅ Login user
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody SignInRequest dto) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword())
        );
        String token = jwtService.generateToken(dto.getUsername());
        return ResponseEntity.ok(Map.of("token", token));
    }

    // ✅ Logout user (optional)
    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        // Add Redis blacklist if needed
        return ResponseEntity.ok("User logged out");
    }
}
