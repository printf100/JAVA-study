package com.test02;

public class RandomCube {

	// 1. 5 X 5 숫자를 출력하자. (0 ~ 9 사이의 랜덤 숫자 하나씩)
	// 2. 만들어진 전체 숫자의 평균을 출력하자.

	static int sum = 0;
	
	public static void main(String[] args) {

		num();
		
		System.out.println("평균 : " + (double)sum / 25);
	}

	public static void num() {

		// 5 X 5 숫자 만들기
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				int r = (int) (Math.random() * 10);
				System.out.printf("%3d", r);
				sum += r;
			}
	
			System.out.println();
		}
	}
	
}
