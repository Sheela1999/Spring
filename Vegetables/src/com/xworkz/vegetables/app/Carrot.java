package com.xworkz.vegetables.app;

public class Carrot implements VegInterface {

	@Override
	public void vitamins(String vitamin) {
		System.out.println("carrot contains vitamin A");

	}

	@Override
	public void stronger() {
		System.out.println("regular consumption can help you to fight against cancer");

	}

	@Override
	public void caloriesInGrams(float calories) {
		System.out.println("low-calorie food");

	}

}
