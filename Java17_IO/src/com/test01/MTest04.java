package com.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest04 {

	public static void main(String[] args) throws IOException {		// main()을 호출해주는 JVM한테 예외 넘겨버림 (별로 안좋은 방법임다)
		
		File file = new File("b.txt");
		
		fileOutput(file);
		fileInput(file);
	}
	
	public static void fileInput(File file) throws IOException {
		
		FileInputStream fi = new FileInputStream(file);
		
		int res;
		
		while((res = fi.read()) != -1) {
			System.out.print((char)res + " ");
		}
		
		fi.close();
	}
	
	public static void fileOutput(File file) throws IOException {
		
		FileOutputStream fo = new FileOutputStream(file);
		
		for(int i=65; i<=90; i++) {
			fo.write(i);
		}
		
		fo.close();
	}
}
