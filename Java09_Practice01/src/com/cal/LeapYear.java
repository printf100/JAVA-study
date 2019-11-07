package com.cal;

import java.util.Scanner;

public class LeapYear {
	
	/*
	 *  ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
	 *  ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,
	 * 	③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
		
		if(isLeapYear(year) == true)
			System.out.println("윤년입니다.");
		else
			System.out.println("윤년이 아닙니다.");
	}
	
	// 윤년 판단
	public static boolean isLeapYear(int year) {
		
		boolean isLeap = false;
		
		if((year%4 == 0) && (year%100 !=0) || (year%400 == 0))
			isLeap = true;
		
		return isLeap;

		/*
		if(year % 4 == 0) {

			if(year % 100 == 0) {	// 100으로 나누어 떨어질 때
			
				if(year % 400 == 0) {	// 400으로 나누어 떨어지면 윤년
					return true;
				} else {
					return false;	// 400으로 나누어 떨어지지 않으면 평년
				}
			}
	
			return true;	// 4로 나누어 떨어지면 윤년
			
		} else
			return false;	// 4로 나누어 떨어지지 않으면 평년
		*/
	}
	
}
