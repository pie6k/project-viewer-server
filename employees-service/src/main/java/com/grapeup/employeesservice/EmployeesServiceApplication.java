package com.grapeup.employeesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeesServiceApplication.class, args);
    }
}
