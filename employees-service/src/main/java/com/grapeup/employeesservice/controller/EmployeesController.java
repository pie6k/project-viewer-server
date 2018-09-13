package com.grapeup.employeesservice.controller;

import com.grapeup.employeesservice.model.Employee;
import com.grapeup.employeesservice.model.EmployeeDetails;
import com.grapeup.employeesservice.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class EmployeesController {

    private EmployeesRepository employeesRepository;

    @Autowired
    public EmployeesController(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String createEmployee(@RequestBody EmployeeDetails employeeDetails) {
        Employee employee = new Employee();
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employeesRepository.save(employee);
        return employee.getId();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public List<EmployeeDetails> getEmployeeDetails(@RequestBody List<String> employeeIds) {
        Iterable<Employee> employeesList = employeesRepository.findAllById(employeeIds);

        return StreamSupport.stream(employeesList.spliterator(), false)
                .map(EmployeeDetails::new)
                .collect(Collectors.toList());
    }
}
