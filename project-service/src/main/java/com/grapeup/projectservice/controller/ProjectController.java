package com.grapeup.projectservice.controller;

import com.grapeup.projectservice.model.Project;
import com.grapeup.projectservice.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<Project> getAllProjects(@PathVariable String id) {
        return projectRepository.getAllProjects();
    }

    @RequestMapping(path = "/project/{id}", method = RequestMethod.GET)
    public Project getProject(@PathVariable String id) {
        return projectRepository.getProject(id);
    }

    @RequestMapping(path = "/project", method = RequestMethod.POST)
    public ResponseEntity<Void> createProject(@RequestBody Project projectData) {
        // TODO
        System.out.println(projectData.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(path = "/project", method = RequestMethod.PUT)
    public ResponseEntity<Void> updateProject(@RequestBody Project projectData) {
        // TODO
        System.out.println(projectData.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(path = "/project/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteProject(@PathVariable String id) {
        // TODO
        System.out.println(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
