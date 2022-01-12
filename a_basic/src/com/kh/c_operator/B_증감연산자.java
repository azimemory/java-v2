package com.kh.c_operator;

public class B_증감연산자 {

	public static void main(String[] args) {
		
		//증감연산자 : ++, --
		//증감연산자는 값을 1씩 증가 시키거나 감소 시킨다.
		// ++ : 1 증가, -- : 1 감소
		//전위연산자(++변수) : 계산(출력, 연산, 대입)을 처리하기 전에 증감
		//후위연산자(변수--) : 계산을 먼저 처리하고 증가나 감소가 발생한다.
		
		int firstNum = 10;
		
		++firstNum; //11
		System.out.println("++firstNum의 결과는 ? " + firstNum);
		firstNum++; //12
		System.out.println("firstNum++의 결과는 ? " + firstNum);
		
		//출력문 안에서 전위연산자 사용
		System.out.println("--firstNum의 결과는 ? " + --firstNum); //11
		System.out.println("firstNum--의 결과는 ? " + firstNum--); //11
		System.out.println("firstNum : " + firstNum); //10
		System.out.println("quize! : " + --firstNum); //9		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}


