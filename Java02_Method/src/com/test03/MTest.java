package com.test03;

public class MTest {

	public static void main(String[] args) {
		
		// 아규먼트 : method 외부에서 전달되는 값
		MyCalc.sum(1, 2);

		int i = 10;
		int j = 3;
		MyCalc.div(i, j);
		
		
		
		int resS = MyCalc.sub(10, 3);
		System.out.println("sub(10, 3)을 호출하고 리턴된 결과값 : " + resS);
		
		double resM = MyCalc.mul(10.3, 3.6);
		System.out.println("mul(10.3, 3.6)을 호출하고 리턴된 결과값 : " + resM);
		
	}
}
