package com.xworkz.mobilephone.app;

public class Smartphone implements MobileInterface {

	@Override
	public void call() {
		System.out.println("calling from Smartphone");

	}

	@Override
	public void message() {
		System.out.println("message from SmartPhone");

	}

}
