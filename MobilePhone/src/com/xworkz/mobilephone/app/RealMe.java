package com.xworkz.mobilephone.app;

public class RealMe implements MobileInterface {

	@Override
	public void call() {
		System.out.println("calling from RealMe");

	}

	@Override
	public void message() {
		System.out.println("Message from RealMe");

	}

}
