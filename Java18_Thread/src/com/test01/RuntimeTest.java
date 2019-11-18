package com.test01;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) {
		
		String path = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
		
		// new를 안쓰는 거 보니 싱글톤 패턴으로 만들어져 있나보당
		Runtime rt = Runtime.getRuntime();
		
		try {
			Process pr = rt.exec(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
