package com.test03;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("1");
		set.add("5");
		set.add("2");
		set.add("7");
		set.add("4");
		set.add("4");
		set.add("3");
		
		System.out.println(set); 	// 중복이 안됨, 자동 정렬됨
		
		setFind(set, "5");
		setDelete(set, "5");
		
		System.out.println(set);
	}
	
	
	public static void setDelete(Set<String> set, String del) {
	
		for(String d : set) {
			if(d.equals(del)) {
				set.remove(del);	// ConcurrentModificationException
				System.out.println(d + " 지웠당!");
				break;
			}
		}
	}
	
	public static void setFind(Set<String> set, String find) {
		
		for(String f : set) {
			if(f.equals(find)) {
				System.out.println(f + " 찾았당!");
			}
		}
	}
}
