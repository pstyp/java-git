package com.qa.abstraction;

public class Chicken extends Bird implements Flyable, Hatchable {

	@Override
	public void emergeFromEgg() {
		System.out.println("cracking egg");
		
	}

	@Override
	public void cheep() {
		System.out.println("cheep");
		
	}

	@Override
	public void spreadWings() {
		System.out.println("spreading wings");
		
	}

	@Override
	public void takeOff() {
		System.out.println("taking off... WHOOSH");
		
	}

	@Override
	public void doThing() {
		System.out.println("I'm doing a thing");
		
	}

	
}
