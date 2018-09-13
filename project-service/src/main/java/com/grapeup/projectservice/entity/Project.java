package com.grapeup.projectservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Document(collection = "projects")
public class Project {

    @Id
    private String id;
    private String name;
    private String clientName;
    private String location;
    private Date startDate;
    private Date endDate;
    private List<String> assignedEmployees = new LinkedList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<String> getAssignedEmployees() {
        return assignedEmployees;
    }

    public void addAssignedEmployees(List<String> assignedEmployees) {
        this.assignedEmployees.addAll(assignedEmployees);
    }

    public void addAssignedEmployee(String employeeId) {
        if (this.assignedEmployees.contains(employeeId)) {
            return;
        }

        this.assignedEmployees.add(employeeId);
    }

    public void removeAssignedEmployee(String employeeId) {
        this.assignedEmployees.remove(employeeId);
    }
}
