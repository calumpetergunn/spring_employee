package com.codeclan.example.EmployeeTracking.controllers;
import com.codeclan.example.EmployeeTracking.models.Project;
import com.codeclan.example.EmployeeTracking.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value="/projects")
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    @GetMapping(value="/projects/{id}")
    public Optional<Project> getProject(@PathVariable Long id){
        return projectRepository.findById(id);
    }
}
