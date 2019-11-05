package com.test02;

public class FruitsBasket {
	
	// field : class의 속성
	static int size = 30;
	public int fruitCount = 5;
	private String fruitName;
	
	// method : class의 기능
	public void setting(String name, int num) {
		
		fruitName = name;
		fruitCount += num;
		
		basketPrn();
	}
	
	private void basketPrn() {
		
		//String res = (size >= fruitCount) ? fruitName +"의 갯수는 " + fruitCount + "개 입니다." : "바구니가 꽉 찼습니다.";
		//System.out.println(res);
		
		if(size >= fruitCount) {
			System.out.println(fruitName +"의 갯수는 " + fruitCount + "개 입니다.");
		} else {
			System.out.println("바구니가 꽉 찼습니다.");
		}
		
	}
}
