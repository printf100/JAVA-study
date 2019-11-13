package com.area;

import java.util.Scanner;

public class Circle extends AreaImpl {

	@Override
	public void print() {
		System.out.print("원의 ");
		super.print();
	}

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력해 주세요 : ");
		int a = sc.nextInt();
		
		double area = (double) (a * a * Math.PI);
		
		setResult(Double.toString(area));
	}

}
