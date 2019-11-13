package com.test04;

public class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("냥냥냥냥");
	}

	public void eat(String feed) {
		System.out.println("고먐미가 " + feed + " 먹는다.");
	}
}
