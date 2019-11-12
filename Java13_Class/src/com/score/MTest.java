package com.score;

public class MTest {

	public static void main(String[] args) {
		
		Score lee = new Score();
		lee.setName("이순신");
		lee.setKor(35);
		lee.setEng(83);
		lee.setMath(94);
		
		Score hong = new Score("홍길동", 98, 45, 98);
		
		System.out.println(lee);
		System.out.println(hong);
	}
}
