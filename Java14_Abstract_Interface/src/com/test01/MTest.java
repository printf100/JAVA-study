package com.test01;

public class MTest {

	public static void main(String[] args) {
		
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.bark();
		dog.bark();
		
		cat.eat("츄르");
		dog.eat("생닭");
		
		// 추상 클래스는 객체 생성 불가능!!!!!!
		//Animal sth = new Animal();
	}
}
