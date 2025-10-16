package com.ty.demoProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "idea")
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ideaTitle;
    private String ideaDescription;
    private String category;

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIdeaTitle() {
        return ideaTitle;
    }
    public void setIdeaTitle(String ideaTitle) {
        this.ideaTitle = ideaTitle;
    }
    public String getIdeaDescription() {
        return ideaDescription;
    }
    public void setIdeaDescription(String ideaDescription) {
        this.ideaDescription = ideaDescription;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Idea [id=" + id + ", ideaTitle=" + ideaTitle + ", ideaDescription=" + ideaDescription + ", category=" + category + "]";
    }
}
