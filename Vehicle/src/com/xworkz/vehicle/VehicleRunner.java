package com.xworkz.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.vehicle.app.Bike;
import com.xworkz.vehicle.app.Plane;
import com.xworkz.vehicle.app.VehicleInterface;
import com.xworkz.vehicle.app.VehicleService;
import com.xworkz.vehicle.config.VehicleConfig;

public class VehicleRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);

		VehicleInterface vehicle = context.getBean(Bike.class);
		vehicle.consumeFuel();
		vehicle.toTravel();

		System.out.println("------------------------------------------------------------------------------");

		VehicleService vehicle1 = context.getBean(VehicleService.class);
		vehicle1.transport();

		System.out.println("------------------------------------------------------------------------------");

		VehicleService service = context.getBean(VehicleService.class);
		service.transport();

	}

}
