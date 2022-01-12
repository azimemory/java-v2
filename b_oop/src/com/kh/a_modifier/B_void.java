package com.kh.a_modifier;

public class B_void {
		
		// void : 메서드의 결과값이 없음을 나타내는 제한자.
		
		//결과값 없는 메서드
		public static void voidTest() {
			System.out.println("반환형이 없는 메서드 입니다.");
		}
		
		//String 타입의 값을 반환하는 메서드
		public static String returnTest() {
			System.out.println("반환형이 있는 메서드 입니다.");
			//String result = "반환형이 있는 메서드 입니다.";
			return "반환형이 있는 메서드 입니다.";
		}
		
		//int 타입의 값를 반환하는 메서드
		public static int intReturnTest(){
			int res = 200 * 300;
			return res;
		}

}
