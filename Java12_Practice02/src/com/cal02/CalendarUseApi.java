package com.cal02;

import java.util.Calendar;
import java.util.Scanner;

// 20191111
// java.util.Calendar 클래스를 사용하여 달력을 출력하자

public class CalendarUseApi {

	/*
	// 내 코드
	public static void main(String[] args) {

		// 원하는 년월 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("YEAR : ");
		int year = sc.nextInt();

		System.out.print("MONTH : ");
		int month = sc.nextInt();

		System.out.println("\t\t   " + year + "년 " + month + "월");
		System.out.println("---------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		Calendar c = Calendar.getInstance();

		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1); // MONTH 범위가 0~11 이기 때문에 입력한 월에서 -1 해줘야 함

		// 달의 마지막 날짜
		int lastOfDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		// 한 주의 요일
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); // 일=1, 월=2, 화=3, ...

		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= lastOfDate; i++) {

			System.out.printf("%d\t", i);

			// 토요일에 날짜 출력하고 줄바꿈
			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}

			dayOfWeek++; // 요일 카운트
		}
	}
	*/
	
	public void prn(int year, int month) {
		
		// singleton pattern : 메모리에 객체가 단 한번만 만들어지고, 이후에 다시 호출하면 메모리에 있는 객체가 전달된다.
		Calendar c = Calendar.getInstance();
		
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// set() : 캘린더 필드에 년, 월, 일 값을 셋팅한다.
		// YEAR : Scanner로 입력받은 year로 셋팅
		// MONTH : Scanner로 입력받은 month로 셋팅, MONTH 범위가 0~11 이기 때문에 입력한 값에서 -1 해줘야 함
		// DATE : 달의 첫 날짜인 1로 셋팅
		c.set(year, month-1, 1);
		
		// get() : 캘린더 필드에 해당하는 값을 리턴해준다.
		// DAY_OF_WEEK : 요일을 숫자로 가져옴 (일=1, 월=2, 화=3, ...)
		// start 변수에 월의 시작 요일을 가져온다.
		int start = c.get(Calendar.DAY_OF_WEEK);
		
		// 일요일(1)부터 시작 요일 전까지 공백 출력하기
		for(int i=1; i<start; i++) {
			System.out.print("\t");
		}
		
		// getActualMaximum : 캘린더 필드의 값이 가질 수 있는 최대값을 리턴
		// DATE : 월의 날짜
		// 1일부터 월의 마지막 날짜까지~
		for(int i=1; i<=c.getActualMaximum(Calendar.DATE); i++) {
			
			System.out.printf("%d\t", i);
			
			// 토요일에 날짜 출력하고 줄바꿈
			if(start % 7 == 0) {
				System.out.println();
			}
	
			start++;	// 요일 카운트
		}
	}

}
