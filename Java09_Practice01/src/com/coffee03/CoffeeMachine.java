package com.coffee03;

import java.util.Scanner;

public class CoffeeMachine {

	public void inputMoney() {

		Scanner sc = new Scanner(System.in);

		System.out.println("일반커피 : 300원\t 고오급커피 : 500원");

		System.out.println("커피를 선택해주세요.(일반커피 = 1, 고오급커피 = 2)");
		int coffee = sc.nextInt();
		
		System.out.println("돈을 넣어주세요.");
		int money = sc.nextInt();
		
		System.out.println("몇 잔 뽑을까요?");
		int num = sc.nextInt();

		if (money >= 300) {
			coffeeMake(money, coffee, num);
		} else {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈은 " + money + "원 입니다.");
		}
	}

	private void coffeeMake(int money, int coffee, int num) {

		int change = 0;
		String str = "";
		
		if(coffee == 1) {
			str = "일반";
			change = money - 300 * num;
		} else if(coffee == 2) {
			str = "고오급";
			change = money - 500 * num;
		}

		System.out.println(str + "커피 " + num + "잔 나왔습니다.");
		System.out.println("잔돈은 " + change + "원 입니다.");
	}
}
