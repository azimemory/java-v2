
// 첫 줄에 package를 명시
// package : 비슷한 성격의 자바 파일을 모아둔 디렉토리
package com.kh.a_first; 

public class HelloWorld {	
	
	//[[comment ]]
	//지금 보고 있는 것이 자바에서 코드를 작성하기 위한 가장 기본적인 양식
	//class 안쪽이 field 영역
	//method 안쪽이 local 영역
	//field 와 local에 작성할 수 있는 것들이 다름, 
	//지금은 우리가 작성할 대부분의 코드가 local에 작성하게 된다... 정도만 알면 됨
	
	//main method
	//자바 어플리케이션을 실행 시키면 main메서드의 첫 줄 부터 코드를 읽기 시작한다.
	//더 이상 읽을 코드가 없으면 어플리케이션이 종료된다.
	
	public static void main(String[] args) { 
		//local 영역 , 지역
		System.out.println(args[0]);
		System.out.println("Hello World!!");
		
	}
}
