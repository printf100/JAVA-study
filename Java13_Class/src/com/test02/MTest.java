package com.test02;

public class MTest {

	public static void main(String[] args) {
		
		/*
		Cat cat = new Cat();
		cat.bark();
		
		Dog dog = new Dog();
		dog.bark();
		*/
		
		// 굳이 부모 타입으로 하는 이유 ?
		Animal sth = null;
		sth = new Dog();
		sth.bark();
		
		sth = new Cat();
		sth.bark();	// 부모 타입으로 만들어 놓으니까 객체를 번갈아가면서 사용할 수 있음
		
		if(sth instanceof Dog) {	// sth이 Dog타입의 값이라면
			System.out.println("댕댕이다!");
		} else if(sth instanceof Cat) {
			System.out.println("고영희다!");
		}
	}
}

/*
 * <다형성> Polymorphism
 * 1. 부모(선조)의 타입으로 자식(후손) 객체를 생성할 수 있다.
 * Parent p = new Child();
 * 
 * 2. 부모의 타입으로 자식을 대입할 수 있다.
 * Child c = new Child();
 * Parent p = c;
 * 
 * 3. 부모의 메소드를 통해 자식 메소드를 호출
 * 
 * *** 같은 부모 클래스를 가지고 있는 자식 클래스는 컴파일 시에는 형변환이 가능하지만, 런타임 시에는 ClassCastException을 발생시킨다.
 */
