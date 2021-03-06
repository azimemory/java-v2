package com.kh.c_web_server.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public void clientStart() {
		//1. 서버의 IP와 Port번호
		int port = 8989;
		String serverIP = "192.168.20.102";
		
		
		Socket socket = null;
		BufferedReader reader = null;
		PrintWriter writer = null;
		
		try {
			
			InetAddress ip = InetAddress.getByName("www.daum.net");
			socket = new Socket(ip.getHostAddress(),80);
			
			//연결에 성공하면 Socket 인스턴스가 반환
			//연결에 실패하면 null
			if(socket != null) {
				//3. 서버와의 입출력 스트림을 생성
				//4. 보조스트림을 사용해 성능 개선
				reader = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());
				
				//5. 스트림을 통해서 읽고 쓰기
				writer.println("GET / HTTP/1.1");
				writer.flush();
				//6. 서버로부터 돌아온 메시지를 출력
				
				String response = "";
				StringBuffer sb = new StringBuffer();
				while((response = reader.readLine()) != null) {
					sb.append(response);
					sb.append("\n");
				}
				
				System.out.println(sb);
				
			}
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
				socket.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
