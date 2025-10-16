package com.ty.demoProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.demoProject.entity.Idea;
import com.ty.demoProject.repository.IdeaRepository;

@Service
public class IdeaService {

    @Autowired
    private IdeaRepository ideaRepository;

    public Idea submitIdea(Idea ideaInput) {
        Idea idea = new Idea();
        idea.setIdeaTitle(ideaInput.getIdeaTitle());
        idea.setIdeaDescription(ideaInput.getIdeaDescription());
        idea.setCategory(ideaInput.getCategory());
        return ideaRepository.save(idea);
    }
}

