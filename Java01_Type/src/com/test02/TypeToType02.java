package com.test02;

public class TypeToType02 {
	
	public static void main(String[] args) {
		
		// int to char
		int i01 = 65;
		char c01 = (char) i01;
		System.out.println("int to char : " + c01);
		// ascii
		
		
		// char to int
		char c02 = 'A';
		int i02 = c02 + 1;
		System.out.println("char to int : " + i02);
		System.out.println((char)i02);
		
		char c03 = '1';
		char c04 = '2';
		System.out.println((char) (c03 + c04));
		
		
		// String to int
		String sr01 = "65";
		int i03 = Integer.parseInt(sr01);	// 숫자로만 이루어진 문자열의 경우, 숫자로 바꿔줌
		System.out.println(i03 + 1);
		
		
		// int to String
		int i04 = 66;
		String sr02 = Integer.toString(i04);	// 숫자를 문자열로 바꿔줌
		System.out.println(sr02 + 1);
		System.out.println(sr02 + 2);
		
		String sr03 = String.valueOf(i04);	// 숫자를 문자열로 바꿔줌
		System.out.println(sr03);
	}
}
