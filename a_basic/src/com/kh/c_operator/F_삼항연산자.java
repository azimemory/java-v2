package com.kh.c_operator;

import java.util.Scanner;

public class F_삼항연산자 {
	
	//삼항연산자 : 조건식 ? a : b
	//조건식?true일때 연산 또는 값:false일때 연산 또는 값
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int res = x>y? x+y : x-y;
		System.out.println("res : " + res);
		
		String result = x < y?"a가 b보다 작다":"a가 b보다 크다";
		System.out.println("result : " + result);
	}
	
	//사용자로부터 하나의 문자를 입력받아
	//입력받은 문자가 'y' 또는 'Y'라면 'y를 입력하셨습니다.'
	//입력받은 문자가 'y' 또는 'Y'가 아니라면 '잘못 입력하셨습니다.' 
	//를 출력하는 코드를 작성하시오.
	public void quize1() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
	}

	//사용자로부터 하나의 숫자를 입력받는다.
	//사용자가 입력한 숫자가 0보다 크면 '양수'출력
	//0이면 '0'출력
	//0보다 작으면 '음수' 출력
	public void opTest2() {
		Scanner sc = new Scanner(System.in);
		
	}
	
	
	
	
}
