package com.test01;

public class MTest {

	static String str = "The String class represents character strings.";
	
	public static void main(String[] args) {
	
		String s = "Hello";
		
		System.out.println(1+2+s);
		System.out.println(s);
		
		// String concatenation
		s = s + 1 + 2;
		System.out.println(s);
		
		System.out.println("--------------------------------------------");

		System.out.println("1. str의 전체 길이 출력");
		System.out.println(str.length());
		System.out.println();
		
		System.out.println("2. str 전체 대문자로 바꾸기");
		System.out.println(str.toUpperCase());
		System.out.println();

		System.out.println("3. str 전체 소문자로 바꾸기");
		System.out.println(str.toLowerCase());
		System.out.println();
		
		System.out.println("4. str에서 첫 번째로 나오는 c의 인덱스 출력");
		System.out.println(str.indexOf('c'));
		System.out.println();
		
		System.out.println("5. \"class\" -> \"java\"로 바꾸기");
		System.out.println(str.replace("class", "java"));
		System.out.println();
		
		System.out.println("6. \"character\" 찾아서 대문자로 변환 후, 변환된 내용으로 전체 출력");
		/*
		String str2 = str.substring(str.indexOf("character"), str.indexOf("character")+9).toUpperCase();
		System.out.println(str.replace("character", str2));
		*/
		String target = "character";
		int start = str.indexOf(target);
		int end = start + target.length();
		
		String upper = str.substring(start, end).toUpperCase();
		System.out.println(str.replace(target, upper));
		System.out.println();
		
		System.out.println("7. str을 char[]로 출력하되, 'c'만 출력하자. 그리고 c의 갯수도 출력하자.");
		char[] ch = str.toCharArray();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(ch[i] == 'c' || ch[i] == 'C') {
				System.out.print(ch[i] + " ");
				count++;
			}
		}
		System.out.println(count);
		System.out.println();
		
		System.out.println("8. str을 char[]로 출력하되, 대문자만 출력하자. 대문자의 갯수도 출력하자.");
		char[] ch2 = str.toCharArray();
		int count2 = 0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(ch[i]) == true) {
				System.out.print(ch2[i] + " ");
				count2++;
			}
		}
		System.out.println(count2);
		System.out.println();

		
		System.out.println("9. 문자열 str 안의 모든 공백 제거 후 출력");
		System.out.println(str.replace(" ", ""));
		System.out.println();
		
		System.out.println("10. 전체를 역순으로 출력");
		/*
		int index = 0;
		char[] ch3 = new char[str.length()];
		for(int i=str.length()-1; i>=0; i--) {
			ch[i] = str.charAt(index);
			index++;
		}
		System.out.println(ch);
		*/
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
