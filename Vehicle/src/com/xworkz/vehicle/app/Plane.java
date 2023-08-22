package com.xworkz.vehicle.app;

import org.springframework.stereotype.Component;

@Component(value = "plane")
public class Plane implements VehicleInterface {

	@Override
	public void toTravel() {
		System.out.println("Plane travel on air");

	}

	@Override
	public void consumeFuel() {
		System.out.println("Plane consume 4 liters of fuel for every second");

	}

}
