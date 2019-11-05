package com.test03;

public class Score {

	public double getAvg(int kor, int eng, int math) {

		return (double) (kor + eng + math) / 3;
	}

	public String getGrade(double avg) {

		switch ((int) avg / 10) {
		case 10:
		case 9:
			return "A";
			
		case 8:
			return "B";
			
		case 7:
			return "C";
			
		case 6:
			return "D";
			
		default:
			return "F";
		}
	}
}
