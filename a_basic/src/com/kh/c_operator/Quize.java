package com.kh.c_operator;

import java.util.Scanner;

public class Quize {

	public static void main(String[] args) {
		
		//일단 먼저 메인메서드에 모든 문제를 작성하고 풀이를 진행 한 다음
		//주석처리하고 풀고 하기 귀찮은 것을 경험한 뒤에  ctrl + 2 + M을 눌러 메서드 추출 
		q1();
		q2();
		q3();
		q4();
	}

	private static void q1() {
		
		// q1. 사용자로 부터 사다리꼴의 윗변, 아랫변, 높이를 입력받아 넓이를 구하시오 
		//사용자로 부터 정수를 하나 입력 받으세요
		Scanner sc = new Scanner(System.in);
		System.out.print("top : ");
		int top = sc.nextInt();
		System.out.print("bottom : ");
		int bottom = sc.nextInt();
		System.out.print("height : ");
		int height = sc.nextInt();
		
		System.out.println("<< 사다리꼴의 넓이 >>");
		System.out.println((top + bottom) * height / 2);
	}
	
	private static void q2() {
		// 사용자로 부터 아이디와 비밀번호를 입력받아
		// 사용자가 알맞은 아이디와 비밀번호를 입력하였다면, '로그인 되었습니다'를 출력하고
		// 아이디와 비밀번호가 맞지 않다면 '누구야 당신?' 을 출력하세요
		// 아이디 : test / 비밀번호 : java
		
		//사용자로부터 아이디와 비밀번호를 입력받는다.
		Scanner sc = new Scanner(System.in);		
		String id = sc.next();
		String pw = sc.next();
	
		if(id.equals("test") && pw.equals("java")) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("누구야 당신?");
		}
	}

	private static void q3() {
		//q2. 사용자가 입력한 정수가 짝수 인지 판단하고
		//짝수라면 '짝수 입니다.'
		//홀수라면 '홀수 입니다.' 를 출력하세요. 
		
		//사용자로부터 하나의 정수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		String res = input % 2 == 0 									
						? "짝수 입니다."
						:"홀수 입니다.";

		//결과를 출력한다.
		System.out.println(res);
	}

	private static void q4() {
		// q3. 사용자가 입력한 숫자가 
		// 0보다 크면 '양수'를  
		// 0보다 작으면 '음수'를  
		// 0이라면 0을 출력 하시오
		
		//사용자로부터 하나의 숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		String result = input > 0? "양수 ": input < 0? "음수" : "0";
		System.out.println(result);
	}
}
