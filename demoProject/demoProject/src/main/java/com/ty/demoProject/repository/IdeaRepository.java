package com.ty.demoProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.demoProject.entity.Idea;

@Repository
public interface IdeaRepository extends JpaRepository<Idea, Long> {
    // Default JpaRepository methods are enough for basic CRUD
}
