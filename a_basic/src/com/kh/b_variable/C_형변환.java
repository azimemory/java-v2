package com.kh.b_variable;

public class C_형변환 {

	//형변환이 필요한 이유
	
	// 컴퓨터의 값 처리 규칙
	// 1. 같은 자료형끼리 대입
	// 2. 같은 자료형끼리 연산
	//  * 다른 타입끼리 대입 또는 연산을 수행 할 경우 자료형을 하나로 통일 해야 한다.
	
	// 형변환(casting) : 자동 형변환(자바가 알아서 형변환)
	//	           			 강제 형변환(개발자가 명시적으로 형변환)
	
	public static void main(String[] args) {

		//자동 형변환
		// 크기가 작은 타입의 변수를 크기가 큰 타입의 변수에 대입할 때 자동 형변환이 발생.
		byte bnum = 100;
		int inum = bnum;
		System.out.println(inum);
		
		//강제 형변환
		// 형변환을 하면 데이터 손실이 발생 하는 경우 강제 형변환을 진행해야 한다.
		
		// * 데이터 손실이 발생하는 경우
		//     1) 크기가 큰 타입의 변수를 크기가 작은 타입의 변수에 대입할 때 데이터 손실이 발생 (Data Overflow)
		//     2) 실수타입의 값을 정수타입의 변수에 담으려고 할 때 데이터 손실이 발생
		//        정수타입의 변수에는 소수부의 값을 보관할 수 없기 때문에 버림처리한다.
		
		//크기가 큰 타입의 변수를 크기가 작은 타입의 변수에 대입
		inum = 128;
		bnum = (byte)inum;
		System.out.println(inum + "를 byte로 강제형변환 : " + bnum);
		
		//실수타입의 값을 정수타입의 변수에 담으려고 할 때
		double dnum = 10.5;
		inum = (int)dnum;
		System.out.println(dnum + "을 int로 형변환 : " + inum);
		
		
		//문자 -> 숫자 형변환
		char ch = 'A';
		int code = ch;
		System.out.println(" A를 숫자로 나타내면 ?  : " + code  );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
