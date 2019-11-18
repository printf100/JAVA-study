package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {

	public static void main(String[] args) {
		
		File file = new File("C:/test_io");
		
		if(file.exists()) {
			System.out.println("exists!");
		} else {
			System.out.println("new!");
			file.mkdirs();
		}
		
		File file1 = new File(file, "AA");
		file1.mkdir();
		
		File file2 = new File("c:/test_io", "BB");
		file2.mkdir();

		
		File txt = new File(file1, "a.txt");
		try {		// Checked Exception : 컴파일할 때 자바가 알려주는 것
			txt.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
