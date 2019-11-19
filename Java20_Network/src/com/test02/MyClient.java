package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// UDP : 데이터를 블록으로 보낸다.

public class MyClient {

	public static void main(String[] args) throws IOException {
		
		System.out.println("클라이언트입니다.");
		
		// client 소켓 생성
		DatagramSocket ds = new DatagramSocket();
		
		// 보낼 데이터 생성
		byte[] buff = "연습입니다.".getBytes();
		
		// 패킷으로 보낼 데이터를 감싼다.
		// 데이터 length만큼 데이터를 localhost의 8888포트에 보내겠다.
		DatagramPacket sendPacket = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"), 8888);
		
		ds.send(sendPacket);	// 데이터 보낸다.
		
		ds.close();
		ds.disconnect();
	}
}
