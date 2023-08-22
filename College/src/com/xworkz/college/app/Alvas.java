package com.xworkz.college.app;

import org.springframework.stereotype.Component;

@Component
public class Alvas implements CollegeInterface{

	@Override
	public void knowledge() {
		System.out.println("we gain knowledge from Alvas");
		
	}

	@Override
	public void skills() {
		System.out.println("we learnt more skills in Alvas");
		
	}

	@Override
	public void getJobOpportunity() {
		System.out.println("we get more opportunities");
		
	}

}
