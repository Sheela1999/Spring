package com.xworkz.mobilephone.app;

public class Iphone implements MobileInterface {

	@Override
	public void call() {
		System.out.println("calling from iPhone");

	}

	@Override
	public void message() {
		System.out.println("Message from iPhone");

	}

}
