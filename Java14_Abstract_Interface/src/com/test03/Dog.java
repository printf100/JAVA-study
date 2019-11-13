package com.test03;

public class Dog implements Animal {

	@Override
	public void bark() {
		System.out.println("댕댕댕댕");
	}

	@Override
	public void eat(String feed) {
		System.out.println("댕댕이가 " + feed + " 먹는당.");
	}

}
