package com.qa.bird;

public class Owl extends Bird{

	private int wingspan=30;
	
	public void doThing() {
		System.out.println("Wingspan: " + this.wingspan + ", flight?: " + super.isFly());
	}
	
}
