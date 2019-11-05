package com.test02;

public class MTest {
	
	/*
	 * class diagram을 보고 FruitsBasket class를 작성하자.
	 * - fruitCount의 초기값은 5
	 * - setting 메소드를 호출할 때, size 변수에 30 대입
	 * - setting 메소드의 String 파라미터는 과일의 이름을 받아서 fruitName 변수에 대입하고,
	 * - int 변수는 과일의 갯수를 받아서 fruitCount 변수에 더해서 대입하자
	 * - basketPrn 메서드는 size와 fruitCount의 값을 비교해서,
	 * - size가 크거나 같으면 과일이름+"의 갯수는"+갯수+"입니다."
	 * - 작으면 "바구니가 꽉 찼습니다."를 출력한다.
	 */	
	
	public static void main(String[] args) {
		
		
		FruitsBasket banana = new FruitsBasket();
		banana.setting("바나나", 20);
		
		banana.size = 100;
		FruitsBasket.size = 50;	// static으로 접근하여 노란줄 오류 해결
		System.out.println(banana.size);
		
		banana.fruitCount = 100;
		//FruitsBasket.fruitCount = 100;	// 안됨
		System.out.println(banana.fruitCount);
		
		
		FruitsBasket apple = new FruitsBasket();
		apple.setting("사과", 30);
		System.out.println(apple.size);	// static이기 때문에 영향을 받아서 50
		System.out.println(apple.fruitCount);	// non-static은 객체 하나하나에만 적용되기 때문에 35
	}
}
