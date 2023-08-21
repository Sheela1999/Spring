package com.xworkz.mobilephone.app;

public class CameraPhone implements MobileInterface {

	@Override
	public void call() {
		System.out.println("calling from Camera Phone");
	}

	@Override
	public void message() {
		System.out.println("Message from Camera Phone");

	}

}
