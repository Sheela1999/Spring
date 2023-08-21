package com.xworkz.mobilephone.app;

public class Redmi implements MobileInterface {

	@Override
	public void call() {
		System.out.println("calling from Redmi");

	}

	@Override
	public void message() {
		System.out.println("Message from Redmi");

	}

}
