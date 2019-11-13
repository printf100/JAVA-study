package com.test03;

// class가 class를 상속받을 땐 extends
// class가 interface를 상속받을 땐 implements
// interface가 interface를 상속받을 땐 extends
public class Cat implements Animal {

	@Override
	public void bark() {
		System.out.println("냥냥냥냥");
	}

	@Override
	public void eat(String feed) {
		System.out.println("고먐미가 " + feed + " 먹는당.");
	}

}
