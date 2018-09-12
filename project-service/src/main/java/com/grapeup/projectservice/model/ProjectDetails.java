package com.grapeup.projectservice.model;

import com.grapeup.projectservice.entity.Project;

import java.util.List;

public class ProjectDetails extends ProjectHeader {

    public ProjectDetails(Project project) {
        super(project);
    }

    private List<EmployeeDetails> assignedEmployees;

    public List<EmployeeDetails> getAssignedEmployees() {
        return assignedEmployees;
    }

    public void setAssignedEmployees(List<EmployeeDetails> assignedEmployees) {
        this.assignedEmployees = assignedEmployees;
    }
}
