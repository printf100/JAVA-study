package com.test01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest02 {

	public static void main(String[] args) {

		File file = new File("a.txt");

		try { // throws로 예외를 넘겨받음
			myOutput(file);
			myInput(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// read() : 컴퓨터에서 화면으로 읽어오는 것
	private static void myInput(File file) throws IOException {		// FileNotFoundException 보다 IOException이 상위라 흡수됨

		FileReader fr = new FileReader(file);

		int ch;

		while ((ch = fr.read()) != -1) {	// 파일 끝까지 다 읽었으면 -1이 리턴됨
			System.out.print((char)ch);
		}
		
		fr.close();
	}

	// write() : 화면에서 컴퓨터롤 write해주는 것
	private static void myOutput(File file) throws IOException { // throws : 해당 메소드를 호출한 애한테 예외 넘김

		FileWriter fw = new FileWriter(file, false);	// (file, boolean) : false면 덮어쓰기 / true면 append 가능
		fw.write("연습중입니다.\n");	// return값이 없음
		fw.append("abc\n").append("def\n").append("ghi\n");	// writer 객체를 리턴 -> 메소드 체이닝 가능

		fw.close();
	}
}
