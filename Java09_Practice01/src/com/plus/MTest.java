package com.plus;

import java.util.Scanner;

// 20191107

public class MTest {

	public static void main(String[] args) {
		
		// 네자리 숫자를 입력하면 각 자리수를 모두 더해서 리턴받아 출력하자.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("네 자리 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		System.out.println(plus(num));
		System.out.println(plusFor(num));
		System.out.println(plusWhile(num));
	}

	public static int plus(int num) {

		int a = (num / 1000) % 10;
		int b = (num / 100) % 10;
		int c = (num / 10) % 10;
		int d = num % 10;

		return a + b + c + d;
	}
	
	public static int plusFor(int num) {
		
		int sum = 0;
		
		/*
		for(int i=0; i<4; i++) {
			sum += (num/Math.pow(10, i)) % 10;
		}
		*/
		
		for(int target = num; target > 0; target /= 10) {
			sum += target % 10;
		}

		return sum;
	}
	
	public static int plusWhile(int num) {
		
		int sum = 0;
		
		/*
		int i = 0;
		while(i < 4) {
			sum += (num/Math.pow(10, i)) % 10;
			i++;
		}
		*/
		
		int target = num;
		while(target > 0) {
			sum += target % 10;
			target /= 10;
		}
		
		return sum;
	}
}