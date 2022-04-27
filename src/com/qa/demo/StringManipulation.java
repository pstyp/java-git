package com.qa.demo;



public class StringManipulation {

	public static void main(String[] args) {

		String str1 = "ThIsIsSoMeSoMeTeXt";
		String str2 = "thisissometext";

//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
//		System.out.println(str1.charAt(6));
//		System.out.println(str1.indexOf("I"));
//		System.out.println(str1.startsWith("t"));
//		System.out.println(str1.endsWith("t"));
//		System.out.println(str1.contains("So"));
//		System.out.println(str1.substring(1,4));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.replace("SoMe", "SOMEREALLYFUN"));
		
	}
}