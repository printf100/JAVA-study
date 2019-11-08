package com.plus;

import java.util.Scanner;

// 20191107

public class MTest {

	public static void main(String[] args) {
		
		// 두자리 이상 숫자를 입력하면 각 자리수를 모두 더해서 리턴받아 출력하자.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("두 자리 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		System.out.println(plus(num));
	}

	public static int plus(int num) {

		int a = (num / 1000) % 10;
		int b = (num / 100) % 10;
		int c = (num / 10) % 10;
		int d = num % 10;

		return a + b + c + d;
	}
}