package com.test01;

public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("댕댕댕댕");
	}

	public void eat(String feed) {
		System.out.println("댕댕이가 " + feed + " 먹는다.");
	}
}
