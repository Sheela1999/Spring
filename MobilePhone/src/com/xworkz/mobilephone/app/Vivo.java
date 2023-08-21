package com.xworkz.mobilephone.app;

public class Vivo implements MobileInterface {

	@Override
	public void call() {
		System.out.println("calling from Vivo");

	}

	@Override
	public void message() {
		System.out.println("Message from Vivo");

	}

}
