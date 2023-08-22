package com.xworkz.vehicle.app;

import org.springframework.stereotype.Component;

@Component
public class Bike implements VehicleInterface {

	@Override
	public void toTravel() {
		System.out.println("Bike running......");

	}

	@Override
	public void consumeFuel() {
		System.out.println("Bike fuel consumption is less");

	}

}
