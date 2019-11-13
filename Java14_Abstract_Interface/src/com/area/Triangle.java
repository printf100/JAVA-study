package com.area;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void print() {
		System.out.print("삼각형의 ");
		super.print();
	}

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("밑변의 길이를 입력해 주세요 : ");
		int a = sc.nextInt();
		System.out.println("높이의 길이를 입력해 주세요 : ");
		int b = sc.nextInt();
		
		double area = (double) (a * b / 2);
		
		setResult(Double.toString(area));
	}

}
