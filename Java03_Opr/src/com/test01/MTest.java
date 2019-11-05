package com.test01;

public class MTest {

	// field (전역변수)
	public static final int TEN = 10;	// final을 붙이면 상수가 됨
	
	public static void main(String[] args) {
		opr01(3);
		
		System.out.println(opr02());
		
		opr03(TEN, 1);
		
		System.out.println(opr04());
		
		opr05();
		
		System.out.println(opr06());
		
		opr07();
	}
	
	
	// 사칙연산
	public static void opr01(int i) {	// 파라미터 i는 지역변수
		
		//TEN = 11; // 이건 안됨
		//int TEN = 11;	// 변수 이름이 전역변수와 겹치는 경우 지역변수가 우세함!! (이름은 같은데 다른 애야~)
		
		System.out.printf("%d + %d = %d \n", TEN, i, TEN + i);
		System.out.printf("%d - %d = %d \n", TEN, i, TEN - i);
		System.out.printf("%d * %d = %d \n", TEN, i, TEN * i);
		System.out.printf("%d / %d = %d ... %d \n", TEN, i, TEN / i, TEN % i);
	}
	
	// 대입연산
	public static String opr02() {
		
		System.out.println("-------------------------------");
		
		int i = 0;
		System.out.println(i);
		
		i = i + TEN;
		System.out.println(i);
		
		i += TEN;
		System.out.println(i);
		
		i -= 5;
		System.out.println(i);
		
		return "대입연산 끗!";
	}
	
	
	// 증감연산
	// 전위연산자 : 변수 앞에 연산자를 붙여서 연산을 먼저하고 값을 나중에 리턴
	// 후위연산자 : 변수 뒤에 연산자를 붙여서 값을 먼저 리턴하고 연산을 나중에
	public static void opr03(int a, int b) {
		
		System.out.println("-------------------------------");
		
		System.out.println(a);
		
		System.out.println(a--);	// 10 (9)
		System.out.println(--a);	// 9 (8)
		
		int res = a++ + ++a + --a + --b;	// 8+10+9+0
		System.out.println(res);
	
	}
	
	
	// 논리연산
	public static boolean opr04() {
		
		System.out.println("-------------------------------");
		
		// & : 둘 다 참(true)이어야 참
		System.out.println(true & true);	// true
		System.out.println(true & false);	// false
		System.out.println(false & true);	// false
		System.out.println(false & false);	// false
		
		// | : 둘 중 하나만 참이면 참
		System.out.println(true | true);	// true
		System.out.println(true | false);	// true
		System.out.println(false | true);	// true
		System.out.println(false | false);	// false
		
		// &&
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		
		// ||
		System.out.println(false || true);	// true
		System.out.println(false || false);	// false
		
		int i = 8;
		boolean res = (TEN > i) &&  (5 < i);
		
		return res;
	}
	
	
	// 비교연산
	public static void opr05() {
		
		System.out.println("-------------------------------");
		
		System.out.println(true == false);
		System.out.println(5 != 6);
	}
	
	
	// 삼항연산
	// (조건) ? 참 : 거짓;
	public static boolean opr06() {
		
		System.out.println("-------------------------------");

		int a = 2;
		int b = 3;
		int i = (a > b) ? a+b : a-b;
		System.out.println(i);
		
		boolean res = false;
		res = (a < b) ? false : true;
		
		String s = (a > b) ? "a가 b보다 크다." : ((a < b) ? "a가 b보다 작다." : "a와 b가 같다.");
		System.out.println(s);
		
		return res;
	}
	
	
	// 비트연산 : &, |, ^, ~, <<, >>
	// (별로 필요없어)
	public static void opr07() {
		
		System.out.println("-------------------------------");

		int a = 10;	// 0000 0000 0000 0000 0000 0000 0000 1010 (32bit = 4byte)
		int b = 2;	// 0000 0000 0000 0000 0000 0000 0000 0010
		
		System.out.println(a & b);	// 연산된 결과가 10진수로 출력됨 = 2
		// 0000 0000 0000 0000 0000 0000 0000 1010
		// 					&
		// 0000 0000 0000 0000 0000 0000 0000 0010
		//					=
		// 0000 0000 0000 0000 0000 0000 0000 0010
		
		System.out.println(a | b);	// 10
		// 0000 0000 0000 0000 0000 0000 0000 1010
		
		
		System.out.println("-------------------------------");
		
		
		// 쉬프트연산
		int c = TEN;
		// 0000 0000 0000 0000 0000 0000 0000 1010
		System.out.println(c >> 2);	// 오른쪽으로 두 칸 밀어라
		System.out.println(Integer.toBinaryString(c >> 2));	// 2진수로 출력해줌
		// 0000 0000 0000 0000 0000 0000 0000 0010
		System.out.println(c << 4);
		System.out.println(Integer.toBinaryString(c << 4));
		// 0000 0000 0000 0000 0000 0000 1010 0000
		
		
		System.out.println("-------------------------------");

		
		// 다르면 참
		System.out.println(a ^ b);
		// 0000 0000 0000 0000 0000 0000 0000 1000
	}
}
