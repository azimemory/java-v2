package com.kh.c_operator;

public class D_비교연산자 {
	
	//비교연산자 :  < , > , <= , >= , == , !=
	//두 개의 변수의 관계를 판단하는 연산자.
	//조건을 만족하면 true, 만족하지 못하면 false
	public static void main(String[] args) {
		// 변수의 타입이 같다면 한줄에 여러개 변수의 선언 및 초기화 가능
		
		// 등위 비교 
		int x = 20, y = 20;		
		System.out.println(x == y);
		System.out.println(x != y);
		
		// 참조타입은 equals 메서드를 사용해 값을 비교
		String name = "홍길동";
		System.out.println(name.equals("홍길동"));
		System.out.println(name.equals("이제동"));
		
		// 대소 비교
		x = 10;
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x >= y);
		System.out.println(x <= y);
		
	}
}
