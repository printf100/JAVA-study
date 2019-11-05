package com.test02;

public class MTest {

	public static void main(String[] args) {
		// Season class를 만들자.
		// 어디서나 접근 가능하고, static 영역에 생성되고, int형 파라미터 하나 받아서 String 값을 리턴하는 getSeason 메소드를 만들자.
		// getSeason 메소드 안에서는 파라미터로 받은 숫자가 12, 1, 2 라면 "겨울", 3, 4, 5라면 "봄", 6,7,8이라면 "여름, 9,10,11이라면 "가을"을 리턴하도록 명령문을 작성하자.
		
		String res = Season.getSeason(11);
		System.out.println(res);
	}
}
