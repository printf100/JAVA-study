package com.test01;

import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("홍길동");
		v.add("강호동");
		v.add("송민호");
		v.add("이수근");
		v.add("표지훈");
		v.add("조규현");
		v.add("은지원");
		v.add("이순신");
		v.add("조세호");
		
		//prn(v);
		
		transElement(v);
	}

	public static void prn(Vector<String> v) {
		
		// 향상된 for문 (forEach문)
		for(String s : v) { 	// v라는 덩어리에서 빼서 s에 담는다.
			System.out.printf("%s\t", s);
		}
		System.out.println();
		// vector에는 toString()이 오버라이드 되어있음
		
		System.out.println(v); 	// 아주 예쁘게 잘나옴
	}
	
	public static void transElement(Vector<String> v) {
		
		
		// 1. 홍길동의 인덱스를 찾아서, 해당 인덱스에 있는 값을 홍길순으로 바꾸자
		int index = v.indexOf("홍길동");
		v.set(index, "홍길순");
		System.out.println(v);
		
		
		// 2. "신"으로 끝나는 객체를 찾아서, 만일 있다면 신을 자로 바꾸자
		/*
		for(String s : v) {
			if(s.endsWith("신")) {
				v.set(v.indexOf(s), s.replace("신", "자"));
			}
		}
		System.out.println(v);
		*/
		
		for(int i=0; i<v.size(); i++) {
			if(v.get(i).endsWith("신")) {
				v.set(i, v.get(i).replace("신", "자"));
			}
		}
		System.out.println(v);
		
		
		// 3. "호" 로 끝나는 객체를 찾아서, 만일 있다면 삭제하자
		for(int i=0; i<v.size(); i++) {
			if(v.get(i).endsWith("호")) {
				v.remove(i);
			}
		}
		System.out.println(v);

		/*
		for(String s : v) {
			if(s.endsWith("호")) {
				v.remove(s);
				break;		// 안하면 ConcurrentModificationException 에러 뜸
			}
		}
		*/
	}

}
