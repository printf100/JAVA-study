package com.cal;

import java.util.Scanner;

public class MyCalendar {

	// 캘린더 만들기

	static int sum = 0;
	static int DateOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("년 : ");
		int year = sc.nextInt();

		System.out.println("월 : ");
		int month = sc.nextInt();

		System.out.println("\t\t[ " + year + "년 " + month + "월 ]");
		calendar(year, month);
	}

	public static void calendar(int year, int month) {

		for (int i = 1; i < year; i++) {

			if (LeapYear.isLeapYear(i) == true) // 윤년이면
				sum += 366;
			else // 평년이면
				sum += 365;
		}

		// 입력한 월 전까지 일수 구하기
		for (int i = 1; i < month; i++) {

			if (i == 2 && LeapYear.isLeapYear(year) == true)
				sum++;

			sum += DateOfMonth[i - 1];
		}
		
		// 1일의 요일 구하기
		int day = (sum + 1) % 7;
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=0; i<day; i++) {
			System.out.print("\t");
		}
		
		for(int i = 1; i <= DateOfMonth[month-1]; i++) {
			System.out.print(i + "\t");
			
			if((day+i) % 7 == 0)
				System.out.println();
		}
	}
}
