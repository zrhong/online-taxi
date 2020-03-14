package com.online.taxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class StudyTurbineHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyTurbineHystrixDashboardApplication.class, args);
	}

}
