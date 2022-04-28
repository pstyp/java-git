package com.qa.demo;

public class Encapsulation {

	// ATTRIBUTES
	private int passportNumber;
	private String memorableWord;

	// CONSTRUCTOR
	public Encapsulation(int passportNumber, String memorableWord) {
		super();
		this.passportNumber = passportNumber;
		this.memorableWord = memorableWord;
	}

	public Encapsulation() {
		super();
	}

	// GETTERS AND SETTERS
	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getMemorableWord() {
		return memorableWord;
	}

	public void setMemorableWord(String memorableWord) {
		this.memorableWord = memorableWord;
	}

	
	// TO STRING METHOD
	@Override
	public String toString() {
		return "Hi I'm [passportNumber=" + passportNumber + ", memorableWord=" + memorableWord + "]";
	}
	
}


