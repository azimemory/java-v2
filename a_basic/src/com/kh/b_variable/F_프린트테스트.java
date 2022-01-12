package com.kh.b_variable;

public class F_프린트테스트 {

	public static void main(String[] args) {
		
		int age = 19;
		String name = "하명도";
		double height = 190.15555;
		
		//1. println() : 매개변수로 들어온 문자열을 출력하고 개행(줄바꿈)한다.
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		//2. print() : 줄바꿈을 하지 않는다.
		System.out.print("이름 : " + name);
		System.out.print(" 나이 : " + age);
		System.out.print(" 키 : " + height);
		
		//3. printf() : 원하는 형식으로 문자열을 출력할 수 있다.
		// %d:정수형,     %c:문자,     %s:문자열,     %f:실수형,     %b:논리형
		// 정렬방식 : %5d : 정수를 표기하기 위해 5칸의 공간을 확보, 우측정렬
		// 				%-5d : 정수를 표기하기 위해 5칸의 공간을 확보, 좌측정렬
		//				%.2f : 소수점 아래 2자리 까지만 표시
		System.out.printf("\n내 이름은 %s, 나이는 %d, 키는 %.1f 이다.", name, age, height);
		System.out.println("\n========================================");
		System.out.printf("%-30s : 10000원\n","김밥");
		System.out.printf("%-20s : 3000원\n","돈까스");
		System.out.printf("%10s : 900000원\n","김치찌개");
		System.out.printf("%8s : 800원\n","매운낚지볶음");
		
		System.out.println("============================");
		
		//escape문자 : 특수한 역할을 하는 문자, \ 와 함께 사용한다.
		//쌍따옴표 : \"
		System.out.println("\"  안녕  \"");
		
		//역슬래시 : \\
		System.out.println("\\  안녕  \\");
		
		//줄바꿈 : \n, \r\n 
		System.out.println(" 나는 \n 밥을 \n 먹었다.");
		
		//tab : \t
		System.out.println("나는 \t 자바가 쉬워요");

		//\u0000 :  유니코드값
		System.out.println("\u0041"); //16진수 41 == 10진수 65
		
		//16진수, 8진수 출력
		System.out.println("16진수 100 : " + 0x100);
		System.out.println("8진수 100 : " + 0100);
	}
}
