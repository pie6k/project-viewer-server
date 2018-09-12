package com.grapeup.projectservice.model;

import com.grapeup.projectservice.entity.Project;

import java.util.Date;

public class ProjectHeader {
    private String id;
    private String clientName;
    private String name;
    private String location;
    private Date startDate;
    private Date endDate;

    public ProjectHeader() {}

    public ProjectHeader(Project project) {
        this.id = project.getId();
        this.clientName = project.getClientName();
        this.name = project.getName();
        this.location = project.getLocation();
        this.startDate = project.getStartDate();
        this.endDate = project.getEndDate();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
