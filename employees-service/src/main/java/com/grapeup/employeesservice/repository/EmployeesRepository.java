package com.grapeup.employeesservice.repository;

import com.grapeup.employeesservice.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeesRepository extends MongoRepository<Employee, String> {
}
