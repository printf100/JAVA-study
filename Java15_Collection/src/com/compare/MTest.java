package com.compare;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
		
		Score[] students = new Score[3];
		
		students[0] = new Score("백승아", 100, 21, 88);
		
		students[1] = new Score();
		students[1].setName("전상엽");
		students[1].setKor(100);
		students[1].setEng(44);
		students[1].setMath(89);
		
		Score sc = new Score("조현준", 22, 33, 55);
		students[2] = sc;
		
		
		for(Score tmp : students) {
			System.out.println(tmp);
		}
	
		Arrays.sort(students);	// 영어 점수가 낮은 것부터 정렬하기
		System.out.println("--------------------------");
		
		for(Score tmp : students) {
			System.out.println(tmp);
		}
		
	}
}
