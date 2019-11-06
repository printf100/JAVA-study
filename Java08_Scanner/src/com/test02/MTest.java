package com.test02;

import java.util.Random;

public class MTest {

	public static void main(String[] args) {

		random01();

		random02();
		
		random03();
	}

	public static void random01() {

		// 0.0 <= Math.random() < 1.0
		double d = Math.random();
		System.out.println(d);
	}

	
	// java.lang.Math 사용하기
	public static void random02() {

		// (int) (Math.random() * (max - min + 1)) + min
		int max = 10;
		int min = 5;
		int r = (int) (Math.random() * (max - min + 1)) + min;
		
		System.out.println(r);
	}
	
	
	// java.util.Random 사용하기
	public static void random03() {
		Random r = new Random();
		
		System.out.println(r.nextInt(10)); // 0 ~ 9까지
		System.out.println(r.nextInt(6) + 5); // 5 ~ 10까지

	}
}
