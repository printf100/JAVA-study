package com.point;

import java.util.Scanner;

public class PointLength {

	public static void main(String[] args) {
		// (0,0) ~ (x,y)의 거리를 구하자.
		// x와 y는 Scanner를 통해 입력받자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x좌표를 입력해주세요 : ");
		int x = sc.nextInt();
		
		System.out.println("y좌표를 입력해주세요 : ");
		int y = sc.nextInt();
		
		double len = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
		System.out.printf("(0,0)부터 (%d,%d)까지의 거리 : %f", x, y, len);
	}

}
