package com.grapeup.projectservice.repository;

import com.grapeup.projectservice.model.Project;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class ProjectRepository {

    public List<Project> getAllProjects() {
        return Collections.singletonList(new Project());
    }

    public Project getProject(String id) {
        return new Project();
    }
}
