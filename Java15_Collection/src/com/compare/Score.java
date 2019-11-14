package com.compare;

public class Score implements Comparable<Object> {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 생성자 (기본 생성자, 파라미터 4개짜리 생성자)
	public Score() {
		
	}
	
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	// getter & setter	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	

	public int getSum() {
		// 3개 다 더해서 리턴
		return kor+eng+math;
	}
	
	public double getAvg() {
		// 평균 리턴
		return (double) getSum()/3.0;
	}
	
	public String getGrade() {
		
		switch((int) (getAvg() / 10)) {
		case 10: case 9:
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

	
	@Override
	public String toString() {
		return "이름 : " + name + "\n국어 : " + kor + " 영어 : " + eng + " 수학 : " + math + " 총합 : " + getSum() + " 평균 : " + getAvg() + " 등급 : " + getGrade() + "\n";
	}


	@Override
	public int compareTo(Object o) {	// 비교의 기준을 정해줌
		/*
		 * 앞의 값이 더 크면 1, 같으면 0, 뒤의 값이 더 크면 -1
		 */
		
		Score other = (Score) o;
		
		if(this.getKor() > other.getKor())
			return 1;	// 국어점수가 낮은 순서대로
		
		else if(this.getKor() < other.getKor())
			return -1;
		
		else if (this.getKor() == other.getKor()){	// 국어점수가 같으면
			
			if(this.getEng() > other.getEng())
				return -1;	// 내림차순 ( 영어점수가 높은 순서대로 )
			else if(this.getEng() < other.getEng())
				return 1;
			else
				return 0;
		}
		
		return 0;
	}

}
