package com.xworkz.vegetables;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.vegetables.app.Carrot;
import com.xworkz.vegetables.app.Peas;
import com.xworkz.vegetables.app.VegInterface;
import com.xworkz.vegetables.config.AppConfig;

public class VegetablesEater {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		VegInterface veg = context.getBean(Carrot.class);
		veg.vitamins("Vitamin A");
		veg.stronger();
		veg.caloriesInGrams(0.9f);

		VegInterface veg1 = context.getBean(Peas.class);
		veg1.vitamins("Vitamin C");
		veg1.stronger();
		veg1.caloriesInGrams(0.7f);
	}

}
