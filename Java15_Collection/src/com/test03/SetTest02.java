package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.score.Score;

public class SetTest02 {

	public static void main(String[] args) {

		Score sc01 = new Score("홍길동", 100, 45, 67);
		Score sc02 = new Score("이순신", 95, 100, 75);
		Score sc03 = new Score("김선달", 61, 89, 100);
		
		Set<Score> set = new HashSet<Score>();
		
		set.add(sc01);
		set.add(sc02);
		set.add(sc03);
		set.add(new Score("조세호", 100, 100, 100));
		
		//prn(set);
		
		transElement(set, "조세호", 0);
	}
	
	
	// Set에 있는 데이터 출력하기
	public static void prn(Set<Score> set) {
		
		// 1.
		for(Score sc : set) {
			//System.out.println(sc);
		}
		
		
		// 2.
		Object[] arr = set.toArray();
		for(int i=0; i<arr.length; i++)
			//System.out.println(arr[i]);
		
		for(Object o : arr) {
			//System.out.println(o);
		}
		
		for(Object o : arr) {
			if(((Score)o).getName().equals("조세호")) {	// downcasting
				//System.out.println(((Score)o).getName() + " : " + ((Score)o).getAvg());
			}
		}
		
		
		// 3. Iterator : 컬렉션 저장 요소를 읽어오는 표준화된 방법
		Iterator<Score> ir = set.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
	
	
	public static void transElement(Set<Score> set, String name, int kor) {
		
		// Iterator를 사용하여 set 안의 객체 중 이름이 조세호인 객체를 찾아서 해당 객체의 국어 점수를 파라미터 값으로 바꾸고 전체 출력하자.
		Iterator<Score> ir = set.iterator();
		while(ir.hasNext()) {
			Score s = ir.next();
			if(s.getName().equals(name)) {
				s.setKor(kor);
			}
		}
		
		prn(set);
	}
}
