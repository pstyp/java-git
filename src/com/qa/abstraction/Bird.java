package com.qa.abstraction;

public abstract class Bird {

	private boolean canFly = true;
	private String colour;
	
	public abstract void doThing();
	
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
