package com.test02;

import java.util.Arrays;

// 20191108

public class DeepCopy {
	// 객체를 복사하여 새로운 객체 연결, 값을 넘김
	// 복사본을 변경해도 원본에 영향 없음

	public static void main(String[] args) {
		
		int[] original = {10,20,30,40,50};
		
		// 방법 1 : 배열 인덱스의 값을 가져와서 복사
		int[] copy1 = new int[original.length];
		
		// 주소값말고 값만 복사
		for(int i=0; i<original.length; i++) {
			copy1[i] = original[i];
		}
		
		copy1[0] = 100;	// copy1[0]의 값만 100으로 바뀜
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy1));
		
		System.out.println(original == copy1);	// false
				
		System.out.println("---------------------------------");
		
		
		// 방법 2 : original한테 요청하여 복사
		int[] copy2 = original.clone();
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy2));
		
		System.out.println(original == copy2);	// false
		
		System.out.println("---------------------------------");

		
		// 방법 3 : java.lang.System을 사용하여 복사
		// System.arrayCopy(원본 배열 객체, 원본 시작위치, 복사 배열 객체, 복사 시작위치, 복사할 갯수);
		int[] copy3 = new int[5];
		
		Arrays.fill(copy3, 4);	// 원하는 값으로 배열을 채움, 안 하면 0으로 채워짐
		System.out.println(Arrays.toString(copy3));
		
		System.arraycopy(original, 0, copy3, 2, 2);
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy3));
		
		System.out.println(original == copy3);	// false
	}
}
