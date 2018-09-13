package com.grapeup.projectservice.controller;

import com.grapeup.projectservice.model.ProjectDetails;
import com.grapeup.projectservice.model.ProjectHeader;
import com.grapeup.projectservice.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<ProjectHeader> getAllProjects() {
        return projectService.findAll();
    }

    @RequestMapping(path = "/project/{id}", method = RequestMethod.GET)
    public ProjectDetails getProject(@PathVariable String id) {
        return projectService.findById(id);
    }

    @RequestMapping(path = "/project", method = RequestMethod.POST)
    public String createProject(@RequestBody ProjectHeader projectData) {
        return projectService.save(projectData);
    }

    @RequestMapping(path = "/project", method = RequestMethod.PUT)
    public ResponseEntity<Void> updateProject(@RequestBody ProjectHeader projectData) {
        // TODO
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(path = "/project/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteProject(@PathVariable String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(path = "/project/{id}/employees/{employeeId}", method = RequestMethod.POST)
    public void addEmployeeToProject(@PathVariable String id, @PathVariable String employeeId) {
        projectService.addEmployee(id, employeeId);
    }

    @RequestMapping(path = "/project/{id}/employees/{employeeId}", method = RequestMethod.DELETE)
    public void removeEmployeeFromProject(@PathVariable String id, @PathVariable String employeeId) {
        projectService.removeEmployee(id, employeeId);
    }
}
