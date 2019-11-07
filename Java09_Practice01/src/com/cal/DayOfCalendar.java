package com.cal;

import java.util.Scanner;

public class DayOfCalendar {

	// 년, 월, 일 입력하면 -> ?년 ?월 ?일은 ?요일입니다. 출력하기
	
	/*
	 * 1. 윤년 계산
	 * 2. 일 수 계산
	 * 3. 요일
	 */

	static int sum = 0;
	static int DateOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("년 : ");
		int year = sc.nextInt();

		System.out.println("월 : ");
		int month = sc.nextInt();

		System.out.println("일 : ");
		int date = sc.nextInt();

		System.out.println(day(year, month, date));
		
	}

	public static String day(int year, int month, int date) {

		for (int i = 1; i < year; i++) {

			if (LeapYear.isLeapYear(i) == true) // 윤년이면
				sum += 366;
			else // 평년이면
				sum += 365;
		}
		
		// 입력한 월 전까지 일수 구하기
		for (int i = 1; i < month; i++) {

			if(i == 2 && LeapYear.isLeapYear(year) == true)
				sum++;
			
			sum += DateOfMonth[i - 1];
		}
		
		// 해당 월의 일수 더하기
		for(int i = 1; i <= date; i++)
			sum ++;
		
		System.out.println(sum + "일");

		// 요일 출력하기
		switch (sum % 7) {
		case 0:
			return "일";

		case 1:
			return "월";

		case 2:
			return "화";

		case 3:
			return "수";

		case 4:
			return "목";

		case 5:
			return "금";

		case 6:
			return "토";
		}

		return "";
	}
}
