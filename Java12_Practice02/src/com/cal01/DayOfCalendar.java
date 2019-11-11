package com.cal01;

// 20191111
// java.util.Calendar 클래스를 사용하지 않고 달력을 출력하자.

public class DayOfCalendar {

	static int sum = 0;
	static int DateOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void calendar(int year, int month) {

		for (int i = 1; i < year; i++) {

			if (isLeapYear(i) == true) // 윤년이면
				sum += 366;
			else // 평년이면
				sum += 365;
		}

		// 입력한 월 전까지 일수 구하기
		for (int i = 1; i < month; i++) {

			if (i == 2 && isLeapYear(year) == true)
				sum++;

			sum += DateOfMonth[i - 1];
		}

		// 1일의 요일 구하기
		int day = (sum + 1) % 7;

		System.out.println("---------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		for (int i = 0; i < day; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= DateOfMonth[month - 1]; i++) {
			System.out.print(i + "\t");

			if ((day + i) % 7 == 0)
				System.out.println();
		}
	}

	public static boolean isLeapYear(int year) {

		boolean isLeap = false;

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			isLeap = true;

		return isLeap;
	}

}
