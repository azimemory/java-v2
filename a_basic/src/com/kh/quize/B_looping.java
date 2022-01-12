package com.kh.quize;

import java.util.Scanner;

public class B_looping {
	
	public static void main(String[] args) {
		q3();
	}
	
	// 사용자로부터 줄 수와 칸수를 입력받아서
	// 사각형을 별로 그리는 이중반복문 작성하시오
	// System.out.print()
	// System.out.println()
	// 차이를 잘 생각하시면 쉽게 해결할 수 있습니다.
	private static void q1() {

		Scanner sc = new Scanner(System.in);
		// 사용자로 부터 줄 수 입력
		System.out.print("줄 수 : ");
		int row = sc.nextInt();
		// 사용자로부터 칸 수 입력
		System.out.print("칸 수 : ");
		int column = sc.nextInt();

		// 사용자가 입력한 칸 수만큼 별을 출력하는 코드를
		// 사용자가 입력한 줄 수 만큼 반복한다.
		for (int i = 0; i < row; i++) {
			// 사용자가 입력한 칸수만큼
			for (int j = 0; j < column; j++) {
				// 별을 한 줄로 출력한다
				System.out.print("*");
			}
			// 안쪽 for문이 종료되면 줄바꿈 처리를 해준다.
			System.out.println();
			System.out.println();
			System.out.println();
			
		}
	}

	// 사용자로부터 정수를 하나 입력받아
	// 사각형을 별로 그리는 데, 대각선에는 숫자를 출력하시오
	// 숫자는 1~사용자가 입력한 숫자까지.
	private static void q2() {
		// 사용자로부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if (i == j) {
					System.out.print(i + 1);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

//	 사용자로부터 정수를 하나 입력받아
//	 정수만큼의 높이를 가지는 직각삼각형을  * 을 사용해 그리세요
//	 이 때 빗변은 해당 행의값을 출력합니다.
//	 출력예시 : 숫자 : 5		
//		1
//		*2
//		**3
//		***4
//		****5
	private static void q3() {
		// 사용자로부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if (i == j) {
					System.out.print(i + 1);
					break;
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	private static void printStar() {
		// 사용자로 부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int cnt = sc.nextInt();
		System.out.print("방향(+ 또는 -) : ");
		char dir = sc.next().charAt(0);

		if (dir == '+') { // 삼각형
			for (int i = 0; i < cnt; i++) {
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else{ // 역삼각형
			for (int i = 0; i < cnt; i++) {
				for (int j = 0; j < cnt-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	
	private static void printDiamond() {
		// 사용자로 부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int cnt = sc.nextInt();
		
		//전체 다이아몬드의 라인수 : cnt * 2 - 1
		
		//삼각형
		//라인수 : cnt
		//n번째 줄의 공백 개수 : cnt-n 
		//n번째 줄의 별 개수 : 2n-1개
		
		//역삼각형
		//라인수 : cnt-1
		//n번째 줄의 공백 개수 : n
		//n번째 줄의 별 개수 : (cnt * 2 -1) - 2n
		
		for(int i = 0; i < cnt; i++)  {
			int line = i+1;
			
			for(int j = 0; j < (cnt-line); j++){
	           System.out.print(" ");
	        }
	        
	        for(int k = 0; k < 2*line-1; k++){
	        	System.out.print("*");
	        }
	        System.out.println();
	    }
		
		for(int i = 0; i < cnt-1; i++)  {
			int line = i+1;
	        
			for(int j = 0; j < line; j++){
	           System.out.print(" ");
	        }
	        
	        for(int k = 0; k < (cnt * 2 -1) - line*2; k++){
	        	System.out.print("*");
	        }
	        System.out.println();
	    }
		
	}
}
