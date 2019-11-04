package com.test02;

public class TypeToType01 {
	
	public static void main(String[] args) {
	
		// 형 변환
		
		// 묵시적 형변환 (upCasting or promotion) : 작은 타입 -> 큰 타입
		byte b01 = 100;
		int i01 = b01;
		System.out.println(i01);
		
		// 명시적 형변환 (downCasting or casting) : 큰 타입 -> 작은 타입
		int i02 = 100;
		byte b02 = (byte) i02;
		System.out.println(b02);
	}
}
