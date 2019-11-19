package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// TCP

public class HelloClient implements Runnable {

	@Override
	public void run() {
		
		// 스트림 : data의 흐름(통로)
		
		try {
			
			Socket clientSocket;	// 서버와 통신하기 위한 연결통로
			PrintWriter out = null;
			BufferedReader in = null;
			BufferedReader stdin = null;
			
			System.out.println("SERVER에 접속 중입니다...");
			
			// 서버에서 열어놓은 포트로 접속, 소켓을 생성하여 연결 요청
			// (InetAddress host, int port) : 호스트 네임, 서버에서 열어놓은 포트
			clientSocket = new Socket("localhost", 9999);
				
			// PrintWriter : 다양한 출력함수를 제공해줌으로써 출력을 편하게 해줌
			// client 소켓의 output 스트림을 자동으로 보내줌
			// true면 autoFlush : 출력 버퍼를 자동으로 비움
			// flush : 버퍼에 남아있는 데이터를 내보내는 것
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			
			// InputStreamReader : client 소켓의 input 스트림을 받음
			// BufferedReader : 그 char 데이터를 뭉텅뭉텅 받아온다. (Input웅앵웅은 하나하나씩 받기때문에!)
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			// InputStreamReader : client의 byte 스트림을 char 스트림으로 바꿔줌
			// 사용자의 입력을 받아 메시지 전송
			stdin = new BufferedReader(new InputStreamReader(System.in));
			
			String inputLine;
			// 사용자가 콘솔창에 입력한 메시지를 읽음
			while((inputLine = stdin.readLine()) != null) {
				out.println(inputLine);	// 연결된 서버에 출력됨
				System.out.println("SERVER로부터 다시 받은 메시지 : " + in.readLine());	// 서버로부터 들어온 데이터 출력
			}
			
			out.close();
			in.close();
			stdin.close();
			clientSocket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		Thread client = new Thread(new HelloClient());
		client.start();
	}

}
