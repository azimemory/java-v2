package com.kh.d_controllStatement.a_decisionMaking;

import java.util.Scanner;

public class D_switch {
	
	//switch-case문
	// 변수의 값을 case에서 찾아 실행하는 조건문
	// (범위가 아니라 정확한 하나의 값)
	// 해당하는 값이 case에 없으면 default문을 실행
	// [표현식]
	// switch(변수){
	// 	 case 1 : 실행문; break; //변수의 값이 1일때 실행
	//	 case 2 : 실행문; break; //변수의 값이 2일때 실행
	//   default : 실행문  //변수의 값이 case에 없을 때 실행
	//   break; 이 없으면 다음 case문들과 default문을 모두 실행
	
	public static void main(String[] args) {
		testSwitch();
	}

	private static void testSwitch() {
		String name = "이자바";
		int java = 100;
		int db = 95;
		int algo = 90;
		int sum = java + db + algo;
		double avg = (double) sum / 3;

		String grade = "";

		System.out.println(name + "학생의 자바점수는 " + java + "점, db점수는 " + db + "점, 알고리즘 점수는 " + algo + "입니다.");
		System.out.println("총점은 " + sum + "점, 평균은 " + avg + "점 입니다.");

		//평균이 90점 이상 100점 이하라면 A등급 부여
		//평균이 80점 이상 90점 미만라면 B등급 부여
		//평균이 70점 이상 80점 미만라면 C등급 부여
		//70점 미만 미수료
		switch ((int)avg/10) { //switch의 매개변수는 정수, 문자, 문자열, enum만 가능
		case 10:
		case 9:
			grade = "A";
			break; //switch문을 탈출시켜주는 예약어
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default:
			grade = "기타";
		}
		
		System.out.println(grade + " 입니다.");
	}
	
	private static void prac() {
		
		//정수 두개와 산술연산기호 1개를 입력받아서
		//연산 기호 문자에 해당하는 계산을 수행하고 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값 : ");
		int firstNum = sc.nextInt();
		System.out.print("두번째 값 : ");
		int secondNum = sc.nextInt();
		System.out.print("연산자 : ");
		String op = sc.next();
		
		int result = 0;
		
		switch(op) {
			case "+" :result = firstNum + secondNum;  break;
			case "-" :result = firstNum - secondNum; break;
			case "*" :result = firstNum * secondNum; break;
			case "/" :result = firstNum / secondNum; break;
			case "%":result = firstNum % secondNum; break;
			default:System.out.println("연산자를 정확하게 입력하세요");
		}
		
		System.out.println("연산 결과 : " + result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
