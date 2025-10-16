package com.ty.demoProject.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ty.demoProject.entity.Profile;
import com.ty.demoProject.service.ProfileService;

@RestController

@CrossOrigin(origins = "*") // Allow frontend access
public class ProfileController {

    @Autowired
    private ProfileService profileService;
    
    @PostMapping("/api/profile")
    public Profile createProfile( @RequestBody Profile input) {
    	
    	return profileService.createProfile(input);
    }

}