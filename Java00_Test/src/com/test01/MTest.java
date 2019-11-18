package com.test01;

import com.qclass.Score;

public class MTest {

	public static void main(String[] args) {
		
		Score sc = new Score();
		
		sc.setName("홍길동");
		sc.setKor(100);
		sc.setEng(40);
		sc.setMath(75);
		System.out.println(sc);
		
		Score lee = new Score("이순신", 80, 68, 55);
		System.out.println(lee);
	}
}
