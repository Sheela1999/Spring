package com.xworkz.mobilephone.app;

public class OnePlus implements MobileInterface {

	@Override
	public void call() {
		System.out.println("calling from OnePlus");

	}

	@Override
	public void message() {
		System.out.println("Message from OnePlus");

	}

}
