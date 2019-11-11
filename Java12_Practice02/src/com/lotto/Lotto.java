package com.lotto;

import java.util.Arrays;

// 20191111
// 1~45 사이의 중복되지 않는 난수 6개를 만들고 정렬해서 출력하자.

public class Lotto {

	public static void main(String[] args) {
	
		int[] lotto = new int[6];
		
		/*
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			
			// 중복제거
			for(int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
			
		}*/
		
		
		// 선생님 코드
		int index = 0;
		
		while(index < 6) {
			
			int ran = (int) (Math.random() * 45 + 1);
			
			if(!isSame(lotto, ran)) {
			
				lotto[index] = ran;
				index++;
			}
		}
		
		// 배열 정렬 1
		Arrays.sort(lotto);
		
		/*
		// 배열 정렬 2
		for(int i=0; i<lotto.length; i++) {
			
			for(int j=1; j<lotto.length; j++) {
			
				if(lotto[j] < lotto[j-1]) {
				
					int temp = lotto[j];
					lotto[j] = lotto[j-1];
					
					lotto[j-1] = temp;
				}
			}
		}
		*/
	
		System.out.println(Arrays.toString(lotto));
	}
	
	
	// 선생님 코드
	public static boolean isSame(int[] lotto, int ran) {
		
		boolean s = false;
		
		for(int i=0; i<lotto.length; i++) {
			
			if(lotto[i] == ran) {
				s = true;
			} else {
				s = false;
			}
		}
		
		return s;
	}
}
