package com.test01;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {

		test01();

		test02();
	}

	public static void test01() {

		Scanner sc = new Scanner(System.in);

		System.out.println("성을 입력해주세요 : ");
		String lastName = sc.nextLine();

		System.out.println("이름을 입력해주세요 : ");
		String firstName = sc.next();

		System.out.println("안녕하세요, " + lastName + firstName + "님.");
		System.out.println(sc.next());
		
		sc.close();
	}

	public static void test02() {

		// 콘솔창에 입력한 숫자의 단만 출력하자.

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요 : ");
		int gugu = sc.nextInt();

		System.out.println(gugu + "단");

		for (int i = 1; i < 10; i++) {
			System.out.println(gugu + " X " + i + " = " + gugu * i);
		}
	}
}
