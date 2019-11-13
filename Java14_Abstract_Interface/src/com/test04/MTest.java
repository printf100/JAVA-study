package com.test04;

public class MTest {

	public static void main(String[] args) {
		
		Animal sth = new Cat();
		sth.bark();
		sth.eat("츄르");
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat("생닭");
		dog.bite();
		
		Eagle eagle = new Eagle();
		eagle.bark();
		eagle.eat("고기");
		eagle.fly();
	}
}
