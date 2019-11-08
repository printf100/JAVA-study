package com.test04;

import java.util.Arrays;

public class MTest {

	/*
	 * 1. 5칸짜리 int형 1차원 배열을 만들자.
	 * 2. 반복문을 사용하여 해당 배열의 앞에서 4개에 5~9 사이의 랜덤한 숫자를 각각 대입하자.
	 * 3. 배열의 5번째 위치한 인덱스에 앞의 4개의 모든 값들을 곱해서 저장하자.
	 * 4. 배열을 출력하자.
	 * 5. 배열 안의 모든 값을 더해서 출력하자.
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = (int) (Math.random() * 5 + 5);
		}
		
		
		int mul = 1;
		for(int i=0; i<arr.length-1; i++) {
			
			mul *= arr[i];
		}
		arr[4] = mul;
		
		System.out.println(Arrays.toString(arr));
		
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
