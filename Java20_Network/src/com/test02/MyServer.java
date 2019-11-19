package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		
		System.out.println("서버입니다.");
		
		// 8888 포트를 통해 서버 소켓을 생성해줌
		DatagramSocket ds = new DatagramSocket(8888);
		
		// 받을 방 생성
		byte[] buff = new byte[1024];
		
		// 받은 데이터를 패킷으로 감싼다.
		DatagramPacket receivePacket = new DatagramPacket(buff, buff.length);
		
		ds.receive(receivePacket);	// 데이터 받는다.
		System.out.println(new String(receivePacket.getData()));	// 받은 byte 배열의 데이터를 String으로 바꿈
		
		ds.close();
		ds.disconnect();
	}
}
