package com.test02;

import com.test01.MethodTest01;	// 다른 패키지면 import해야 함

public class MethodTest03 {

	public static void main(String[] args) {
		
		MethodTest01.publicMethod();
		//MethodTest01.protectedMethod();	// extends로 가능
		
		MethodTest01 method01 = new MethodTest01();
		method01.nonStaticMethod();
		
		
		// UML : Unified Modeling Language
		// http://www.objectaid.com/update/current 에서 다운받았당
	}
}
