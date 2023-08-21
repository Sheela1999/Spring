package com.xworkz.mobilephone.app;

public class Nokia implements MobileInterface {

	@Override
	public void call() {
		System.out.println("calling from Nokia");

	}

	@Override
	public void message() {
		System.out.println("Message from Nokia");

	}

}
