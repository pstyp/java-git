package com.qa.bird;

public class Chicken extends Bird {

	private int eggCount = 0;
	
	
	public void doThing() {
		System.out.println("Flight? " + super.isFly());
	}
	
	@Override
	public void noise() {
		System.out.println("chuck-chuck");
	}
}
