package com.xworkz.employeeproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.employeeproject.service.EmployeeService;
import com.xworkz.employeeproject.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.xworkz.employeeproject")
public class EmployeeConfig {
	
	@Bean
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl();
	}

}
