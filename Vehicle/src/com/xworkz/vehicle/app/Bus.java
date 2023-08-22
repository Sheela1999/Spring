package com.xworkz.vehicle.app;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle {

	@Override
	public void transportation() {
		System.out.println("carry people from place to place");

	}

	@Override
	public void protection() {
		System.out.println("Public Transport by Bus");

	}

}
