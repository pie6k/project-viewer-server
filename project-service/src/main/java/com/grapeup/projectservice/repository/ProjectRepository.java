package com.grapeup.projectservice.repository;

import com.grapeup.projectservice.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
