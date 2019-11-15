package com.test02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {

		int i = 0;

		try {
			
			System.out.println("숫자를 입력해주세요 : ");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			
			if(i == 4) {
				throw new MyException("예외 발생 연습");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력");
		} catch (MyException e) {
			System.out.println("4 입력됨");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("뭔지는 모르겠지만 어쨌든 예외!");
		}

	}
}
