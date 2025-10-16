package com.ty.demoProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ty.demoProject.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // No need to redeclare save()
}

