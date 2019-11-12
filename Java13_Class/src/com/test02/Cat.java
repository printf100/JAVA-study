package com.test02;

public class Cat extends Animal {

	public Cat() {
		System.out.println("고영희");
	}
	
	// override(재정의) : 상속받은 부모의 메소드를 확장하거나 변형하는 것
	@Override	// annotation : 컴파일러한테 얘가 뭐다~라고 알려주는거
	public void bark() {
		System.out.println("냥냥냥냥");
	}
}
