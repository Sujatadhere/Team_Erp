package com.ty.demoProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ty.demoProject.entity.Idea;
import com.ty.demoProject.service.IdeaService;

@RestController
@RequestMapping("/api/idea")
@CrossOrigin(origins = "*") // Allow frontend access
public class IdeaController {

    @Autowired
    private IdeaService ideaService;

    @PostMapping("/api/idea")
    public Idea submitIdea(@RequestBody Idea ideaInput) {
        return ideaService.submitIdea(ideaInput);
    }
}
