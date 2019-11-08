package com.test01;

import java.util.Arrays;

// 20191107

public class MTest01 {

	// Array : 여러 개의 값을 효과적으로 관리하기 위한 객체
	// 같은 타입
	public static void main(String[] args) {

		// 방법1
		int[] a; // 선언
		a = new int[5]; // 정의

		// 초기화
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		// 방법2
		// 선언 	정의 		초기화
		int[] b = new int[] { 6, 7, 8, 9, 10 };

		// 방법3
		// 선언 			초기화
		int c[] = { 11, 12, 13, 14, 15, 16, 17 };
		
		prn(c);
		
		// 배열 원소들 출력
		System.out.println(Arrays.toString(c));
		
		String s[] = new String[] {"have", "a", "nice", "day"};
		test(s);
	}
	
	public static void prn(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%3d", arr[i]);
		}
	}
	
	public static void test(String[] arr) {
		// nice -> good으로 바꾸고
		// have, a, good, day 로 출력하자.
		// 단, Arrays 클래스 사용하지 말 것!
		
		arr[2] = "good";
		
		System.out.print("[");

		for(int i=0; i < arr.length; i++) {
			
			System.out.print(arr[i]);
			
			if(i < arr.length - 1)
				System.out.print(", ");
		}

		System.out.println("]");
	}
}
