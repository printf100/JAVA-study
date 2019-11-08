package com.test02;

import java.util.Arrays;

// 20191108

public class ShallowCopy {
	// 주소값 전달
	// 복사본을 변경하면 원본도 변경됨

	public static void main(String[] args) {
		
		int[] original = {10,20,30,40,50};
		int[] copy = original;	// 배열 주소값만 복사
		
		copy[0] = 100;	// 같은 주소값이므로 둘다 값이 바뀜
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(original==copy);	// true
	
		// hashcode : 객체의 주소값
		System.out.println(original.hashCode());
		System.out.println(copy.hashCode());	// 두 배열은 같은 주소값을 참조함
	}
}
