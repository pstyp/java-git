package com.qa.bird;

public class Runner {

	public static void main(String[] args) {
	
	Owl owlFriend = new Owl();
	owlFriend.doThing();
	owlFriend.noise();	
	
	Chicken chick = new Chicken();
	chick.doThing();
	chick.noise();
	System.out.println(chick.isFly());
	}

}
