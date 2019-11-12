package com.test02;

// 20191107

public class MTest02 {

	public static void main(String[] args) {
		prn();
	}
	
	public static void prn() {
		
		int i = 0;
		
		while(i <= 10) {

			i++;
			
			if(i % 2 == 0) {
				continue;	// 해당 반복문의 제일 위로 올라감
			}
			
			System.out.println(i);
		}
	}
}
