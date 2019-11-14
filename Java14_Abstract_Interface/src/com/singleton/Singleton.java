package com.singleton;

// singleton pattern
// heap 메모리에 객체를 한 번만 생성
// 이미 생성되어있는 객체의 주소값을 참조한다.
// new 사용 불가능
public class Singleton {
	
	// 2. 객체의 주소값을 확인할 변수를 static으로 선언
	private static Singleton singleton;

	// 1. 생성자를 외부에서 호출할 수 없도록 private으로 선언
	private Singleton() {
		System.out.println("singleton instance 생성");
	}
	
	// 3. 객체가 heap에 존재하는지 확인한다.
	// 		만일 존재하지 않으면 생성하고 존재하면 만들어져 있는 객체의 주소값을 리턴
	public static Singleton getInstance() {
		
		if(singleton == null) { 	// 객체가 아직 안 만들어졌다면
			singleton = new Singleton();
			System.out.println("new!");
		} else {
			System.out.println("exists!");
		}
		
		return singleton;
	}
}
