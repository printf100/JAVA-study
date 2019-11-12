package com.cal;

import java.util.Scanner;

public class DayOfCalendar {

	// 년, 월, 일 입력하면 -> ?년 ?월 ?일은 ?요일입니다. 출력하기
	
	/*
	 * 1. 윤년 계산
	 * 2. 일 수 계산
	 * 3. 요일
	 */

	static int sum = 0;	// 내꺼
	static int sum2 = 0; // 선생님 코드
	static int DateOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("년 : ");
		int year = sc.nextInt();

		System.out.println("월 : ");
		int month = sc.nextInt();

		System.out.println("일 : ");
		int date = sc.nextInt();

		System.out.println(year + "년 " + month + "월 " + date + "일은 " + day(year, month, date) + "요일입니다.");
		
		
		
		// 선생님 코드
		for(int i=1; i<year; i++) {
			for(int j=1; j<=12; j++) {
				sum2 += dates(i, j);
			}
		}
		
		for(int i=1; i<month-1; i++) {
			sum2 += dates(year, i);
		}
		
		sum2 += date;
		
		System.out.printf("%d년 %d월 %d일은 %s입니다.", year, month, date, dayMode(sum2));
	}
	

	// 내꺼
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
	
	
	
	// 선생님 코드
	// 윤년 계산
	public static boolean isLeapYear(int year) {
		
		boolean isLeap = false;
		
		if((year%4 == 0) && (year%100 !=0) || (year%400 == 0))
			isLeap = true;
		
		return isLeap;
	}
	
	// 일수 계산
	public static int dates(int year, int month) {
		int res = 0;
		
		if(isLeapYear(year)) {
			
			switch(month) {
			case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
				res = 31;
				break;
				
			case 4:	case 6:	case 9:	case 11:
				res = 30;
				break;
				
			case 2:
				res = 29;
				break;
			}
			
		} else {
			
			if(month == 1 || month == 3 || month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12) {
				res = 31;
			} else if(month == 4 || month == 6 || month == 9 || month == 11) {
				res = 30;
			} else if(month == 2) {
				res = 28;
			}
		}
		
		return res;
	}
	
	public static String dayMode(int date) {
		
		switch (date % 7) {
		case 0:
			return "일요일";

		case 1:
			return "월요일";

		case 2:
			return "화요일";

		case 3:
			return "수요일";

		case 4:
			return "목요일";

		case 5:
			return "금요일";

		case 6:
			return "토요일";
		}

		return "";
	}
}
