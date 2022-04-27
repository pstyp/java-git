package com.qa.demo;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(helloWorld("Hello", true, 1));
	}

	private static String helloWorld(String message, boolean bool, int num) {
		if (bool && num>1) {
			return message;
		} else if (bool && num<=1) {
			return "bye";
		}
		else {
			return "Hello world";
		}
	}
}