package com.test01;

public class Type04 {
	
	// 문자형, 문자열, 논리형
	public static void main(String[] args) {
		
		// 문자형 '' : 하나만 가질 수 있음
		char c01 = 'a';
		System.out.println(c01);
		
		char c02 = 'b';
		System.out.println(c02);
		
		char sumC = (char) (c01 + c02);
		System.out.println(sumC);
		
		
		System.out.println("--------------------");

		
		// 문자열 "" : 
		String s01 = "a";
		String s02 = "bc";
		String sumS = s01 + s02;
		System.out.println(sumS);
		
		
		System.out.println("--------------------");

		
		// ascii code도 가능 (native2ascii.exe)
		char lastName = '\ubc31';
		System.out.println(lastName);
		
		String firstName = "\uc2b9\uc544";
		System.out.println(firstName);
		
		
		System.out.println("--------------------");

		
		// 논리형
		boolean bl01 = true;
		boolean bl02 = false;
		System.out.println(bl01);
		System.out.println(bl02);
	}

}
