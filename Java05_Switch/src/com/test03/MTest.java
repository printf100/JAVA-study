package com.test03;

public class MTest {
	
	// Score 클래스를 완성하자.
	// getAvg 메소드는 국어, 영어, 수학 점수를 전달하면 평균을 리턴
	// getGrade 메소드는 평균을 전달하면
	// 90~100 : A
	// 80~89 : B
	// 70~79 : C
	// 60~69 : D
	// 0~59 : F 리턴
	// "ㅇㅇㅇ님의 평균은 xx.xx점이고, 등급은 'ㅇ'입니다." 출력

	public static void main(String[] args) {
		
		Score s = new Score();
		
		double avg = s.getAvg(80, 100, 70);
		String grade = s.getGrade(avg);
		
		//System.out.printf("승아님의 평균은 %.2f점이고, 등급은 '%s'입니다.", avg, grade);
		System.out.println("승아님의 평균은 " + String.format("%.2f", avg) + "점이고, 등급은 '" + grade + "'입니다.");
	}

}
