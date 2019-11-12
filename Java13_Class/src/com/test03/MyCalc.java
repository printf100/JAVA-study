package com.test03;

// 오버로딩 : 같은 이름으로 다른 일을 한다.
public class MyCalc {

	public int sum(int i, int j) {
		return i+j;
	}
	
	public double sum(double i, double j) {
		return i+j;
	}
	
	public int sum(int i, int j, int k) {
		return i+j+k;
	}
}
