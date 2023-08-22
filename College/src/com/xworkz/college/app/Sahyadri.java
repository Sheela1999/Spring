package com.xworkz.college.app;

import org.springframework.stereotype.Component;

@Component
public class Sahyadri implements CollegeInterface {

	@Override
	public void knowledge() {
		System.out.println("Knowledge from sahyadri");

	}

	@Override
	public void skills() {
		System.out.println("we learn skills from sahyadri");

	}

	@Override
	public void getJobOpportunity() {
		System.out.println("we have more job opportunities in sahydri");

	}

}
