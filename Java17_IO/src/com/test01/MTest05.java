package com.test01;

import java.io.File;

public class MTest05 {

	public static void main(String[] args) {

		File file = new File("c:\\");

		// prn01(file);
		prn02(file);
	}

	public static void prn01(File file) {

		// C드라이브에 있는 모든 파일이 다나옴 (숨김파일까지)
		for (String list : file.list()) {
			System.out.println(list);
		}
	}

	public static void prn02(File file) {

		int dirNum = 0, fileNum = 0;

		for (File list : file.listFiles()) {

			if (list.isDirectory()) {
				System.out.println("dir : " + list.getName());
				dirNum++;
			} else if (list.isFile()) {
				System.out.println("file : " + list.getName());
				fileNum++;
			}
		}

		System.out.println("dir의 총 갯수 : " + dirNum);
		System.out.println("file의 총 갯수 : " + fileNum);
	}
}
