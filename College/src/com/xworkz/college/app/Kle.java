package com.xworkz.college.app;

import org.springframework.stereotype.Component;

@Component
public class Kle implements CollegeInterface{

	@Override
	public void knowledge() {
		System.out.println("Knowledge from kle");
		
	}

	@Override
	public void skills() {
		System.out.println("Skills from kle");
		
	}

	@Override
	public void getJobOpportunity() {
		System.out.println("job opportunity from kle");
		
	}

}
