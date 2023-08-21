package com.xworkz.mobilephone.app;

public class Samsung implements MobileInterface {

	@Override
	public void call() {
		System.out.println("calling from Samsung");

	}

	@Override
	public void message() {
		System.out.println("Message from Samsung");

	}

}
