package com.xworkz.mobilephone.app;

public class FeaturePhone implements MobileInterface {

	@Override
	public void call() {
		System.out.println("calling from Feature Phone");

	}

	@Override
	public void message() {
		System.out.println("Message from Feature Phone");

	}

}
