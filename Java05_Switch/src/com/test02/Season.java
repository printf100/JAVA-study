package com.test02;

public class Season {
	
	public static String getSeason(int i) {
		
		switch(i) {
		case 12:
		case 1:
		case 2:
			return "겨울";
			
		case 3:
		case 4:
		case 5:
			return "봄";
			
		case 6:
		case 7:
		case 8:
			return "여름";
			
		case 9:
		case 10:
		case 11:
			return "가을";
		
		default:
			return "존재하지 않는 달입니다";
		}
		
	}

}
