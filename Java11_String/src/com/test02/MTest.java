package com.test02;

public class MTest {

	public static void main(String[] args) {
		//stringTest();
		stringBufferTest();
	}
	
	public static void stringTest() {
		String s = "안녕하세오 ";
		System.out.println(s.hashCode());
		
		s += "저는 ";
		System.out.println(s.hashCode());	// 주소값이 바뀌었음 (새로운 리터럴 생성)
		
		s += "뜽아에오 ";
		System.out.println(s.hashCode());	// 또 바뀜
		
		System.out.println(s);
		
		s.replace("안녕하세오 ", "하위 ");	// 바꾼 새로운 문장을 s와 연결시켜주지 않았기 때문에,
		System.out.println(s);	// 안녕하세요가 안 바뀐 걸로 나옴
		
		s = s.replace("안녕하세오 ", "하위 ");
		System.out.println(s);
	}
	
	public static void stringBufferTest() {
		
		// mutable : 값이 변할 수 있다.
		StringBuffer sb = new StringBuffer();
		/*
		sb.append("안녕하세오 ");
		System.out.println(sb.hashCode());
		
		sb.append("저는 ");
		System.out.println(sb.hashCode());	// 주소값 안 바뀜
		
		sb.append("뚱아에오 ");
		System.out.println(sb.hashCode());	// 안 바뀜
		
		System.out.println(sb);
		*/
		
		sb.append("안녕하세오 ")
		.append("저는 ")
		.append("뚱아에오 ");	// 메소드 체이닝
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}
}
