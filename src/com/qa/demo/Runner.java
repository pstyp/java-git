package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		
	Encapsulation example = new Encapsulation();
	
	example.setPassportNumber(5060354);
	example.setMemorableWord("eggs");
	
	System.out.println(example.getPassportNumber());
	System.out.println(example.getMemorableWord());
	
	
	System.out.println(example);
	}

}
