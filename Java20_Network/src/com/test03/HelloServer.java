package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;	// client의 접속을 받기위한 연결통로
		Socket serviceSocket;	// 여러 client들을 구별하기 위한 것
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			// 9999 포트를 기반으로 한 서버소켓 생성
			serverSocket = new ServerSocket(9999);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("CLIENT를 기다립니다...");
			
			try {

				// client로부터 연결 요청이 올 때까지 대기
				// 서버 소켓에 접속한 client를 소켓으로 관리해줌
				serviceSocket = serverSocket.accept();
				System.out.println("CLIENT가 접속했습니다.");
				
				// client에서 보낸 input 스트림 받기
				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
				
				// true : 출력 버퍼를 자동을 비움
				out = new PrintWriter(serviceSocket.getOutputStream(), true);
				
				String inputLine;
				// client로부터 온 문자열을 읽음
				while((inputLine = in.readLine()) != null) {
					System.out.println("CLIENT가 보낸 메시지 : " + inputLine);	// client로부터 들어온 데이터 출력
					out.println("* " + inputLine);	// 연결된 client에 출력됨
				}
				
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
