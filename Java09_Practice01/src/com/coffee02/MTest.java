package com.coffee02;

public class MTest {
	
	// "돈을 넣어주세요"
	// 10000
	// "커피 몇 잔이 필요하신가요?"
	// 1
	// "커피 1잔이 나왔습니다. 잔돈은 9700원입니다."

	public static void main(String[] args) {
		
		CoffeeMachine coffee = new CoffeeMachine();
		coffee.inputMoney();
	}
}
