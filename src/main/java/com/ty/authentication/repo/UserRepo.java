package com.ty.authentication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ty.authentication.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    // Spring Data JPA will automatically implement this method
    Users findByUsername(String username);

    
}
