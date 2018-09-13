package com.grapeup.projectservice.model;

import com.grapeup.projectservice.entity.Project;

import java.util.List;

public class ProjectDetails extends ProjectHeader {

    public ProjectDetails(Project project, List<EmployeeDetails> assignedEmployees) {
        super(project);
        this.assignedEmployees = assignedEmployees;
    }

    private List<EmployeeDetails> assignedEmployees;

    public List<EmployeeDetails> getAssignedEmployees() {
        return assignedEmployees;
    }
}
