package com.test01;

public class MTest {

	public static void main(String[] args) {
		
		AA a = new AA();
		Super s = a;	// 부모 타입으로 자식을 받을 수 있다. (다형성)
		
		//BB b = (BB) s;	// ClassCastException : 자식들끼리는 다른 애에요 형변환 안돼요
		System.out.println(a.hashCode() + " " + s.hashCode());	// a랑 s의 주소값이 같음
	}
}
