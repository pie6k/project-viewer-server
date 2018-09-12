package com.grapeup.projectservice.service;

import com.grapeup.projectservice.model.ProjectDetails;
import com.grapeup.projectservice.model.ProjectHeader;

import java.util.List;

public interface ProjectService {
    List<ProjectHeader> findAll();

    ProjectDetails findById(String id);

    String save(ProjectHeader projectData);
}
