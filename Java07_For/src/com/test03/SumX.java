package com.test03;

public class SumX {

	 /*
	 * 1  2  3  4  5 
	 * 6  7  8  9  10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 23 24 25
	 * 
	 * X의 총 합, X의 평균
	 */
	
	static int count = 0;
	static int sum = 0;
	static int[][] arr = new int[5][5];
	
	public static void main(String[] args) {
				
		int a = 1;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				arr[i][j] = a;
				a++;
			}
		}
		
		// 출력
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("X의 총 합 : " + sum());
		System.out.println("X의 평균 : " + sum()/count);
	}

	
	// 총 합
	public static int sum() {
		
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				
				if(i == j || i + j == 4) {
					count++;
					sum += arr[i][j];
				}
			}
		}
		
		return sum;
	}
}
