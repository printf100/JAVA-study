package com.test04;

public class MTest {

	/*
	 * 가장 먼저 실행 됨
	 * 접근제한자는 public, 메모리영역은 static, 리턴타입은 void, 이름은 main
	 */
	public static void main(String[] args) {
		
		int kor, eng, math;
		kor = eng = math = 0;	// 값을 대입 or 초기화
		
		kor = 99;
		eng = 34;
		math = 79;
		
		int sum;
		double avg;
		String avg2;	// String 클래스를 이용해서 포맷 정해주기
		
		// 3. main 메소드에서 getSum과 getAvg를 호출하여 총점과 평균을 출력해라
		sum = getSum(kor, eng, math);
		avg = getAvg(sum);
		System.out.printf("getSum으로 구한 총점은 %d점이고, getAvg로 구한 평균은 %f점입니다.\n", sum, avg);
		
		String.valueOf(avg);
		avg2 = String.format("%.2f", avg);
		System.out.println("소숫점 둘째자리 까지 : " + avg2);
	}
	
	// 1. 국어, 영어, 수학 점수를 받아서 총점을 리턴하는 메소드 만들기
	// 		접근제한자 default, 메모리영역 static, 리턴타입 int, 파라미터 int형 변수 3개, 메소드이름 getSum
	static int getSum(int i, int j, int k) {
		int sum = i + j + k;
		
		return sum;
	}
	
	// 2. 총점을 받아서 평균을 리턴하는 메소드 만들기
	//		접근제한자 private, 메모리영역 static, 리턴타입 double, 파라미터 int형 변수 1개, 메소드이름 getAvg
	private static double getAvg(int sum) {
		double avg = (double)sum / 3;
		
		return avg;
	}
}