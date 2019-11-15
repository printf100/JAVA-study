package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalc {

	public int inputNum() {

		int n = 0;

		System.out.println("숫자만 입력하세요 : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	// InputMismatchException

		return n;
	}

	public int calculation() {

		int res = 0;

		while (true) {
			
			try {
				res = inputNum() / inputNum();

				String a = "10";
				int i = Integer.parseInt(a);	// NumberFormatException
				
				System.out.println(res);
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("숫자 입력 에러");
				//e.printStackTrace();	// 어디서 에러가 났는지 알려주는 것 ( 빨간색 글씨랑 코드 줄 번호 뜨는 거 )
			} catch (NumberFormatException e) {
				System.out.println("숫자 변환 에러");
				e.printStackTrace();
			} finally {	// 예외가 발생하든, 발생하지 않든 무조건 출력
				System.out.println("-------------------------");
			}
		}

		return res;
	}
}
