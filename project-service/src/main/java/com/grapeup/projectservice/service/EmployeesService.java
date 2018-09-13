package com.grapeup.projectservice.service;

import com.grapeup.projectservice.model.EmployeeDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
@FeignClient(name = "employee-service")
public interface EmployeesService {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public List<EmployeeDetails> getEmployees(@RequestBody List<String> employeeIds);
}
