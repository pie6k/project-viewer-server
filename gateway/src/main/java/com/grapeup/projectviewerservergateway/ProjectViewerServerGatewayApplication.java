package com.grapeup.projectviewerservergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ProjectViewerServerGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectViewerServerGatewayApplication.class, args);
	}
}
