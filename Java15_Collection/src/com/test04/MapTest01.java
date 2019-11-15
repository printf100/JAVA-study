package com.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest01 {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i=111; i<116; i++) {
			map.put(i, i+1000);		// 들어가는 순서가 없음
		}
		
		map.put(112, 1113);	// 중복이 안됨
		
		System.out.println(map);
		System.out.println(map.get(112));
		
		prn(map);
	}
	
	
	public static void prn(Map<Integer, Integer> map) {
		
		// Entry : key 따로 value 따로 접근할 수 있음
		Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
		
		/*
		for(Entry<Integer, Integer> entry : entrySet) {
			if(entry.getValue() == 1113) {
				System.out.println(entry.getKey());
			}
		}
		*/
		
		// Iterator를 사용해서 위의 forEach문과 같은 결과를 출력하자.
		Iterator<Entry<Integer,Integer>> entryIt = entrySet.iterator();
		
		while(entryIt.hasNext()) {
			Entry<Integer, Integer> m = entryIt.next();
			
			if(m.getValue() == 1113) {
				System.out.println(m.getKey());
			}
		}
	}
		
}
