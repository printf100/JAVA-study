package com.bbb;

import com.aaa.AAA;

public class BBB extends AAA {	// AAA 클래스를 상속받음

	// field
	private int b;
	
	public BBB() {
		// super();	// 부모의 생성자를 명시하지 않는 경우, 부모의 기본생성자를 자동 호출
		// 부모의 기본생성자 -> public AAA();를 호출
		System.out.println("BBB() 생성");
	}
	
	public BBB(int b) {
		super(b);	// 부모의 생성자 -> public AAA(in abc)를 호출하는 것
		this.b = b;
		System.out.println("BBB(int b) 생성");
	}
	
	public BBB(int abc, int b) {
		super(abc);
		this.b = b;
		System.out.println("BBB(int abc, int b) 생성");
	}
	
	// getter & setter
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getSum() {
		// super : 부모의 객체(생략할 수 있음 -> 부모꺼니까 맘대로 갖다 쓸 수 있으니깐~)
		// this : 나의 객체(생략할 수 있음)
		int sum = super.getAbc() + this.getB();	// this.getAbc(), getAbc(), getB() 다 됨
		return sum;
	}
	
	public void prn() {
		System.out.println("BB의 prn 메소드");
	}
}
