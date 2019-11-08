package com.test01;

// 20191107

public class MTest03 {

	// 1. a~z의 값을 1차원 배열에 저장하고 다음과 같이 출력하자
	/*
	 * a b c d e f
	 * g h i j k l
	 * m n o p q r
	 * s t u v w x
	 * y z
	 */
	// 2. 위에서 만든 배열을 거꾸로 출력하자
	// 3. 1번에서 만든 배열을 대문자로 바꿔서 출력하자
	public static void main(String[] args) {
		
		char[] alphabet = new char[26];
		
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) ('a' + i);
		}
		
		prn01(alphabet);
		prn02(alphabet);
		prn03(alphabet);

	}

	public static void prn01(char[] c) {
		
		// 출력
		for (int i = 1; i <= c.length; i++) {

			System.out.print(c[i-1] + " ");

			if (i % 6 == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------");
	}
	
	
	public static void prn02(char[] c) {
		
		// 거꾸로 출력
		int count = 1;
		for (int i = c.length; i > 0; i--) {

			System.out.print(c[i-1] + " ");
			
			if (count % 6 == 0)
				System.out.println();
			
			count++;
		}
		System.out.println();
		System.out.println("--------------------------");
	}
	

	public static void prn03(char[] c) {

		// 대문자로 바꿔서 출력
		for (int i = 1; i <= c.length; i++) {

			//System.out.print((char) (c[i] - 32) + " ");
			System.out.print(Character.toUpperCase(c[i-1]) + " ");

			if (i % 6 == 0)
				System.out.println();
		}
		System.out.println();
	}
}
