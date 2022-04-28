package com.qa.bird;

public class Bird {

	private boolean fly = true;
	
	
	public void noise() {
		System.out.println("tweet");
	}


	//getter and setter
	public boolean isFly() {
		return fly;
	}


	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
}
