package com.xworkz.vehicle.app;

import org.springframework.stereotype.Component;

@Component(value = "car")
public class Car implements Vehicle {

	@Override
	public void transportation() {
		System.out.println("Easy Transport from Car");

	}

	@Override
	public void protection() {
		System.out.println("Car gives Protection from sun");

	}

}
