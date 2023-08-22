package com.xworkz.college.app;

import org.springframework.stereotype.Component;

@Component
public class Excellent implements CollegeInterface{

	@Override
	public void knowledge() {
		System.out.println("Excellent is having puc and coaching classes also");
		
	}

	@Override
	public void skills() {
		System.out.println("Excellent is having a skillSet");
		
	}

	@Override
	public void getJobOpportunity() {
		System.out.println("Job opportunity from Excellent");
		
	}

}
