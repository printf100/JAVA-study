package com.test01;

// 추상 클래스 : 추상 메소드를 하나 이상 가진 클래스
// 반드시 구현해야 하는 메소드들을 모아놨을 때 사용하면 된당
public abstract class Animal {

	// 추상 메소드 : 상속받는 자식 class에서 반드시 구현하도록 강제
	// body { } 가 없다.
	public abstract void bark();
	
	public void eat(String feed) {
		System.out.println(feed + " 먹는다.");
	}
}
