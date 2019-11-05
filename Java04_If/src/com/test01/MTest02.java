package com.test01;

import java.lang.Character;

public class MTest02 {

	public static void main(String[] args) {
		/*
		 * 1. 아규먼트가 5의 배수이면 "5의 배수입니다." 출력하는 메소드를 만들자
		 * 2. 아규먼트가 2의 배수이면서 3의 배수이면 "2와 3의 배수입니다." 출력하고 아니면 "2와 3의 배수가 아닙니다." 출력
		 * 3. 아규먼트가 소문자라면 "소문자입니다." 출력하고, 대문자라면 "대문자입니다." 출력
		 * 4. 메소드 세개를 호출
		 */

		test01(10);

		test02(6);

		test03('c');
	}

	public static void test01(int i) {
		
		if (i % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
	}

	public static void test02(int i) {
		
		if (i % 2 == 0 && i % 3 == 0) {
			System.out.println("2와 3의 배수입니다.");
		} else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
	}

	public static void test03(char ch) {

		if (Character.isLowerCase(ch)) {
			System.out.println("소문자입니다.");
		} else if (Character.isUpperCase(ch)) {
			System.out.println("대문자입니다.");
		}

		// ascii code 이용하기
		if ((int) ch >= 97 && (int) ch <= 122) {
			System.out.println("소문자입니다.");
		} else if ((int) ch >= 65 && (int) ch <= 90) {
			System.out.println("대문자입니다.");
		}
	}
}
