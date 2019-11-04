package com.test01;

public class MethodTest01 {

	// Method : 기능 (명령문들의 집합)
	public static void main(String[] args) {
		
		// class.method() 형태로 호출!		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		defaultMethod();	// 같은 class내면 class 이름 생략 가능
		privateMethod();
	}
	

	// 접근제한자 메모리영역 리턴타입 메소드이름(파라미터){ 명령문; }
	
	// 접근제한자 : 접근을 제한해준다.
	// public : 어디서나 접근, 참조 가능 (기호 : +)
	public static void publicMethod() {
		System.out.print("접근제한자 1. ");
		System.out.println("public");
	}
	
	// protected (#)
	// 1. 상속일 경우 : 상속된 곳에서
	// 2. 상속이 아닐 경우 : 같은 패키지 내에서만
	protected static void protectedMethod() {
		System.out.println("접근제한자 2. protected");
	}
	
	// (default) (~) : 같은 패키지 내에서만
	static void defaultMethod() {
		String str = "default";
		System.out.printf("접근제한자 3. %s \n", str);
	}
	
	// private (-) : 현재 클래스 내에서만
	private static void privateMethod() {
		System.out.println("접근제한자 4. private");
	}
	
	public void nonStaticMethod() {
		System.out.println("non static method!");
	}
}