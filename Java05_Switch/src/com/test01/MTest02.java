package com.test01;

public class MTest02 {

	public static void main(String[] args) {
		// java 1.7 이후
		String s = "한국";
		
		switch(s) {
		case "한국":
			System.out.println("Korea");
			break;
			
		case "중국":
			System.out.println("China");
			break;
			
		case "일본":
			System.out.println("Japan");
			break;
			
		default:
			System.out.println("다른 나라입니다.");
		}
		
	}

}
