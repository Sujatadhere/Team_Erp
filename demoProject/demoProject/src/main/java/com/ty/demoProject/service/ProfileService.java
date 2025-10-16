package com.ty.demoProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.demoProject.entity.Profile;
import com.ty.demoProject.repository.ProfileRepository;

@Service
public class ProfileService {
	
	@Autowired
	 private ProfileRepository pRepo;
	
	public Profile createProfile(Profile input) {
		Profile profile = new Profile();
		System.out.println(input.toString());
		profile.setEmail(input.getEmail()); // must be set!
		profile.setName(input.getName());
		profile.setMob(input.getMob());
		profile.setImgUrl(input.getImgUrl());
		 return pRepo.save(profile);

	}

}
