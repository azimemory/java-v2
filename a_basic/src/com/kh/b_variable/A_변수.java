package com.kh.b_variable;

public class A_변수 {
	
	public static void main(String[] args) {
		
		// * 자바의 기본형(primitive)타입
		// 		논리형(boolean)
		// 		문자형(char)
		// 		숫자형(byte, short, int, long, float, double)	

		//논리형
		boolean bool; //1byte
		
		//문자형
		char ch;			//2byte
		
		//정수형
		byte bnum;      //1byte
		short snum;		//2byte	
		int inum;			//4byte
		long lnum;		//8byte
		
		//실수형
		float fnum;		//4byte
		double dnum;	//8byte
	
		//변수의 초기화 
		//	 선언한 변수에 처음으로 값을 넣는 것.
		//	 지역에서 사용하는 변수는 초기화를 해야지만 변수를 사용할 수 있다.
		
		bool = true;
		System.out.println("당신은 잘 생겼습니까? : " + bool);
		
		ch = 'A';
		System.out.println("ch : " + ch);
		
		bnum = 1;
		System.out.println("bnum : " + bnum);
		
		snum = 2;
		System.out.println("snum : " + snum);
		
		inum = 4;
		System.out.println("inum : " + inum);		
				
		//  lnum = 2000000000   
		//  error 발생! The literal 200000000000 of type int is out of range 
		// 	literal : 변수에 할당하는 값 자체		
		// 	literal의 타입은 자바 표준 타입을 따른다. int, double	
		
		lnum = 20000000000L; // long타입 literal 표기법
		System.out.println("lnum : " + lnum);
		
		fnum = 1.11f;			 // float 타입 literal 표기법
		System.out.println("fnum : " + fnum);
		
		dnum = 1.1111;
		System.out.println("dnum : " + dnum);
		
		//String : 참조형(reference) 타입
		String name ="하명도";
		System.out.println("당신의 이름은 " +  name + " 입니다.");
		
	}
}
