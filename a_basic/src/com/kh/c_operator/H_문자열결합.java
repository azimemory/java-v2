package com.kh.c_operator;

public class H_문자열결합 {

	public static void main(String[] args) {
		
		//문자열 결합
		String str = "기차 ";
		System.out.println(str);
		
		String str2 = " 칙칙폭폭!";
		System.out.println(str2);
		
		//문자열 결합
		// + 의 피연산자 중 하나라도 문자열이면 문자열 결합 연산 수행
		System.out.println(str + 10 + "호가 출발 합니다." + str2);
		System.out.println(25 + 10 + "호 기차가" + " 출발 합니다." + str2);
		System.out.println(str + (25 + 10) + "호가 출발 합니다." + str2);
	}
}
