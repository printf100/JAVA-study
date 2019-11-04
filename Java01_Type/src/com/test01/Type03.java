package com.test01;

public class Type03 {
	
	// 실수형 리터럴 : float(4) double(8)
	// float -> 접미사 f/F
	// double -> 생략 가능, 접미사 d/D
	public static void main(String[] args) {
		
		float f01 = 0.1f;
		System.out.println(f01);
		
		float f02 = 1.1F;
		System.out.println(f02);
		
		float sumF = f01 + f02;
		System.out.println(sumF + " = " + f01 + " + " + f02);
		
		
		System.out.println("--------------------");
		
		
		double d01 = 0.1;	// 실수 리터럴 기본 타입
		double d02 = 2.2d;
		double sumD = d01 + d02;
		System.out.println(sumD);

	}

}
