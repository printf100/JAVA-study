package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		
		// 메모리 영역 : static / (non-static)
		// static인 경우 : class.method()로 호출
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		
		// non-static인 경우 : class 변수 = new class();
		// 변수.method() 형태로 호출
		MethodTest01 method01 = new MethodTest01();
		method01.nonStaticMethod();
		
	}
}
