package com.test02;

public class Cat extends Animal {

	@Override
	public void start() {
		System.out.println("고먐미 걷는다.");
	}

	@Override
	public void stop() {
		System.out.println("고먐미 멈췄다.");
	}

}
