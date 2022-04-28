package com.qa.poly;

public class Runner {

	public static void main(String[] args) {
		
	Cow cow = new Cow();
	cow.speak();
	cow.sleep();


	Animal animal = new Cow();
	animal.sleep();
	((Cow) animal).speak();
	
	
	Object object = new Cow();
	((Cow) object).sleep();
	((Cow) object).speak();
	}

}
