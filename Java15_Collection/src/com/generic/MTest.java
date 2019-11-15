package com.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MTest {

	public static void main(String[] args) {
		
		// <>(generics) : 컬렉션 안에 들어가는 값의 타입을 강제한다. -> 의도치 않은 에러를 방지하기 위해!
		/*
		List<Integer> list = new ArrayList<Integer>();
		
		//list.add("1");
		list.add(2);
		//list.add("c");
		list.add(null);
		list.add(3);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		*/
		
		Emp<String> samsung = new Emp<String>();
		
		samsung.setEname("홍길동");
		samsung.setEmpno("dev0015");
		
		Emp<Integer> lg = new Emp<Integer>(19019, "이순신");
		
		Emp kt = new Emp("abcd", "김선달");
		
		System.out.println(samsung);
		System.out.println(lg);
		System.out.println(kt);
	}
}
