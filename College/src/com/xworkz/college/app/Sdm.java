package com.xworkz.college.app;

import org.springframework.stereotype.Component;

@Component
public class Sdm implements CollegeInterface {

	@Override
	public void knowledge() {
		System.out.println("sdm is enginnering college");

	}

	@Override
	public void skills() {
		System.out.println("more skills from sdm");

	}

	@Override
	public void getJobOpportunity() {
		System.out.println("job opportunity from sdm");

	}

}
