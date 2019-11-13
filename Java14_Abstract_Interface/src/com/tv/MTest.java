package com.tv;

public class MTest {

	public static void main(String[] args) {
		
		SamsungTV s = new SamsungTV();
		s.volumeUp();
		s.volumeDown();
		System.out.println(s.getVolume());
		
		LGTV lg = new LGTV();
		lg.volumeUp();
		lg.volumeUp();
		lg.volumeDown();
		System.out.println(lg.getVolume());
	}
}
