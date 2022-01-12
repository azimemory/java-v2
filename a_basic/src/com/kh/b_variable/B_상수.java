package com.kh.b_variable;

public class B_상수 {

	public static void main(String[] args) {
		
		//상수 : 값을 변경 할 수 없는 수
		//변수 앞에 final 예약어를 붙여 상수로 만들 수 있다.
		// 	ex) final int COUNT;
		
		//상수명을 작성할 때는 변수명과 구분을 쉽게 하기 위해 모두 대문자로 작성한다.		
		//여러 단어를 결합해서 상수명을 지을 때는 '_'로 연결한다. (uppercase snake 표기법)		
		int age = 10; //변수
		final int BOOK_COUNT = 20; //상수
		
		age = 50;
		//BOOK_COUNT = 100;
		System.out.println("BOOK_COUNT : " + BOOK_COUNT);

	}
}
