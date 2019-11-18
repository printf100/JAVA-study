package com.test02;

public class SleepTest {

	public static void main(String[] args) {
		
		while(true) {
			for(int i=1; i<=10; i++) {
				try {
					Thread.sleep(300);	// 해당 초만큼 멈춰라
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.printf("%c ", '♥');
			}
			System.out.println();
		}
	}
}
