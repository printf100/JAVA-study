package com.test02;

import java.util.StringTokenizer;

public class StringCutter {

	public static void main(String[] args) {
		
		String str = "The String class represents character strings.";

		// 문자열 자르기
		// 방법 1
		System.out.println(str.substring(4, 10));
		
		
		// 방법 2
		String[] tmp = str.split(" ");	// 공백으로 자르겠다.
		System.out.println(tmp[1]);
		
		
		// 방법 3 : java.util.StringTokenizer
		String str2 = "represents.character.strings.";
		StringTokenizer st = new StringTokenizer(str2, ".");	// stringtokenizer가 잘라서 가지고 있음
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
