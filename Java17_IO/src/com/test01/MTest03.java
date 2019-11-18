package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest03 {

	public static void main(String[] args) {

		File file = new File("a.txt");

		// 순서 중요!!
		myOuput(file);
		myInput(file);
	}

	private static void myInput(File file) {

		// try with resource : try(예외가 발생할 수 있는 구문) { 명령; } catch() { ... }
		// 만일 close()해주는 객체가 있다면, 자동으로 close(); 해줌
		try ( FileReader fr = new FileReader(file); ) {
			
			int ch;
			
			while((ch = fr.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void myOuput(File file) {

		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(file, true);
			fw.write("연습중입니다.");
			fw.append("abc").append("def\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
