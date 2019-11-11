package com.cal01;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("YEAR : ");
		int year = sc.nextInt();

		System.out.println("MONTH : ");
		int month = sc.nextInt();

		System.out.println("\t\t   " + year + "년 " + month + "월");
		DayOfCalendar.calendar(year, month);
	}
}
