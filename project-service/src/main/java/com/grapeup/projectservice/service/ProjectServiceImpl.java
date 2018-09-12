package com.grapeup.projectservice.service;

import com.grapeup.projectservice.entity.Project;
import com.grapeup.projectservice.exceptions.ProjectNotFoundException;
import com.grapeup.projectservice.model.EmployeeDetails;
import com.grapeup.projectservice.model.ProjectDetails;
import com.grapeup.projectservice.model.ProjectHeader;
import com.grapeup.projectservice.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<ProjectHeader> findAll() {
        return projectRepository
                .findAll()
                .stream()
                .map(ProjectHeader::new)
                .collect(Collectors.toList());
    }


    @Override
    public ProjectDetails findById(String id) {
        // Asserts.
        Optional<Project> projectOpt = projectRepository.findById(id);
        projectOpt.orElseThrow(() -> {

            return new ProjectNotFoundException("Project with " + id + "is not found.");
        });
        // TODO: convert assigned employee details
        return new ProjectDetails(projectOpt.get());
    }

    private List<EmployeeDetails> getEmployeeDetails(String projectId) {
        return Collections.emptyList();
    }

    @Override
    public String save(ProjectHeader projectData) {
        return projectRepository.save(convertToProject(projectData)).getId();
    }

    private Project convertToProject(ProjectHeader projectHeader) {
        Project project = new Project();
        project.setId(projectHeader.getId());
        project.setName(projectHeader.getName());
        project.setClientName(projectHeader.getClientName());
        project.setLocation(projectHeader.getLocation());
        project.setStartDate(projectHeader.getStartDate());
        project.setEndDate(projectHeader.getEndDate());
        return project;
    }
}
