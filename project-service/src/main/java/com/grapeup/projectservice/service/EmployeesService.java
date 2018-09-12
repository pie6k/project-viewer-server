package com.grapeup.projectservice.service;

import com.grapeup.projectservice.model.EmployeeDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "employees-service")
public interface EmployeesService {
    @RequestMapping("/employee/{projectId}")
    public List<EmployeeDetails> getEmployees();
}
