package com.xworkz.vehicle.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

	@Autowired
	@Qualifier(value = "car")
	private Vehicle vehicle;
	
	@Autowired
	@Qualifier(value = "plane")
	private VehicleInterface vehicleInterface;

	public void transport() {
		vehicle.transportation();
		vehicle.protection();
		
		vehicleInterface.consumeFuel();
		vehicleInterface.toTravel();
	}

}
