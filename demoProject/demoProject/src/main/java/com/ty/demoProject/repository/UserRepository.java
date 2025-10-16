package com.ty.demoProject.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ty.demoProject.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}

