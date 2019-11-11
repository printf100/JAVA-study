package com.ant;

import java.util.Arrays;
import java.util.Scanner;

// 20191111
// 베르나르 베르베르의 개미 수열
/*
 * 1
 * 1 1
 * 1 2
 * 1 1 2 1
 * 1 2 2 1 1 1
 * 1 1 2 2 1 3
 * 1 2 2 2 1 1 3 1
 */

public class AntQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 단계 할거니 ? (3 이상 입력)");
		int step = sc.nextInt();

		int array[][] = new int[step][];

		// 초기값 주기
		array[0] = new int[] { 1 };
		array[1] = new int[] { 1, 1 };

		
		for (int i = 2; i < step; i++) {
			fillRow(array, i);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

	// 각 단계별 칸 갯수 구하기
	public static int colLength(int[][] array, int col) {

		int count = 2;

		for (int i = 1; i < array[col - 1].length; i++) {

			if (array[col - 1][i - 1] != array[col - 1][i]) {
				count += 2; // 두 칸씩 만들기
			}
		}

		return count;
	}

	// 각 단계별로 줄 채우기
	public static void fillRow(int[][] array, int col) {

		int index = 0;
		int[] temp = new int[colLength(array, col)];

		// 초기값 정해주기
		temp[0] = array[col - 1][0];
		temp[1] = 1;

		for (int i = 1; i < array[col - 1].length; i++) {

			// 바로 전 단계 검사
			if (array[col - 1][i - 1] == array[col - 1][i]) {	// 같으면

				temp[index + 1]++;

			} else {	// 새로운 숫자가 나오면

				index += 2;
				
				// 초기값 정해주기
				temp[index] = array[col - 1][i];
				temp[index + 1] = 1;

			}
		}

		array[col] = temp;
	}
}
