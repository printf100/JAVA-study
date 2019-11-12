package com.bbb;

import com.aaa.AAA;

public class MTest {

	public static void main(String[] args) {
		
		BBB b1 = new BBB();
		b1.setAbc(1);
		b1.setB(2);
		System.out.println(b1.getAbc() + " + " + b1.getB() + " = " + b1.getSum());
		
		BBB b2 = new BBB(3);
		System.out.println(b2.getAbc() + " + " + b2.getB() + " = " + b2.getSum());
		
		BBB b3 = new BBB(4, 5);
		System.out.println(b3.getAbc() + " + " + b3.getB() + " = " + b3.getSum());
		
		System.out.println("------------------------------");
	
		AAA a1 = new AAA();
		AAA a2 = new BBB();	// 부모 타입으로 자식 객체 생성 가능
		//BBB b4 = (BBB) new AAA();	// ClassCastException : 자식 객체로 부모 객체를 받을 수 없음
		a1.prn();
		a2.prn();
		//b4.getSum();
	}
}
