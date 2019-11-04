package com.test02;

public class TypeToType03 {
	
	public static void main(String[] args) {
		
		// boxing : 값을 wrapper class 안에 넣는 것
		Integer i = new Integer(100);	// 객체(값) 생성
		System.out.println(i);
		
		
		// unboxing : wrapper class에서 값을 꺼내오는 것
		// 명시적 방법
		int j = i.intValue();	// 가져올거야~
		System.out.println(j);
		
		// 묵시적 방법
		int k = i;
		System.out.println(k);
		
	}

}
