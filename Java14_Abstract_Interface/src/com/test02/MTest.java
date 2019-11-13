package com.test02;

import java.util.Scanner;

public class MTest {

	/*
	 * 동적 바인딩 : 런타임 시 메모리 할당을 하면서 메모리를 동적으로 연결하는 방식
	 * 
	 * 사용하는 이유
	 * 1. 메모리 절약
	 * 2. 실행속도 향상
	 * 3. 행위 은닉
	 * 
	 */
	public static void main(String[] args) {
		
		// 팩토리 패턴이라고 한당
		System.out.println("선택해 주세요. (1 : 고먐미 , 2 : 댕댕이 , 3 : 판다)");
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		Animal sth = null;
		
		switch(select) {
		
		case 1:
			sth = new Cat();
			break;
			
		case 2:
			sth = new Dog();
			break;
			
		case 3:
			sth = new Panda();
			break;
		}
		
		sth.start();
		sth.stop();
	}
}
