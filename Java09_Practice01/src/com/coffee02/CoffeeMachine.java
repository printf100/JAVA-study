package com.coffee02;

import java.util.Scanner;

public class CoffeeMachine {

	public void inputMoney() {
		System.out.println("한 잔에 300원");

		System.out.println("돈을 넣어주세요.");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		System.out.println("몇 잔 뽑을까요?");
		int num = sc.nextInt();

		if (money >= 300) {
			coffeeMake(money, num);
		} else {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈은 " + money + "원 입니다.");
		}
	}

	private void coffeeMake(int money, int num) {

		int change = money - 300 * num;

		System.out.println("커피 " + num + "잔 나왔습니다.");
		System.out.println("잔돈은 " + change + "원 입니다.");
	}
}
