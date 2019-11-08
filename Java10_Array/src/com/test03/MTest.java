package com.test03;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
		
		Person lee = new Person();
		lee.name = "이순신";
		lee.age = 33;
		
		Person hong = new Person();
		hong.name = "홍길동";
		hong.age = 19;
		
		Person cho = new Person();
		cho.name = "조세호";
		cho.age = 40;
		
		
		// 객체 배열
		Person[] pclass = new Person[27];	// 아무것도 없는, 아무 값도 안 준 null상태임 -> NullPointerException 에러
		
		pclass[0] = new Person();	// 값 주기
		pclass[0].name = "이동헌";
		pclass[0].age = 100;
		
		pclass[1] = new Person();
		pclass[1].name = "강유진";
		pclass[1].age = 20;
		
		pclass[2] = new Person();
		pclass[2].name = "권다솜";
		pclass[2].age = 20;
		
		System.out.println(Arrays.toString(pclass));
		System.out.println(pclass[0].name);
	}
}
