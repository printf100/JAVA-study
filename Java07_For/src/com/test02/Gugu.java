package com.test02;

public class Gugu {

	public static void main(String[] args) {

		gugu01();

		gugu02(4);

		gugu03();
	}

	public static void gugu01() {
		// 2단 ~ 9단까지 전체 출력 (for)

		for (int i = 2; i <= 9; i++) {

			System.out.println("<" + i + "단>");

			for (int j = 1; j <= 9; j++) {

				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
		}

	}

	public static void gugu02(int i) {
		// i단만 출력 (for)

		System.out.println("<" + i + "단>");

		for (int k = 1; k < 10; k++) {
			System.out.printf("%d X %d = %d\n", i, k, i * k);
		}

	}

	public static void gugu03() {
		// 2단 ~ 9단까지 전체 출력 (while)

		int i = 2;
				
		while (i < 10) {

			System.out.println("<" + i + "단>");
			
			int j = 1;

			while (j < 10) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
				j++;
			}
			
			i++;
		}
		
	}
}
