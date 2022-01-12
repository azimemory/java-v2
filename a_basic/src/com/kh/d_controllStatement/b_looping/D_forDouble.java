package com.kh.d_controllStatement.b_looping;

import java.util.Scanner;

public class D_forDouble {
	
	//2중 for문
	public static void main(String[] args) {
		// testForDouble();
		// q1();
		// q2();
	
	}

	private static void testForDouble() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("몇번 반복될까? " + j);
			}
			System.out.println("=========================");
		}
	}

	// 2중for문으로 구구단
	// 2단~9단까지 출력해보기
	private static void q1() {
		for (int i = 2; i < 10; i++) {
			System.out.println("=========" + i + "단=======");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}

	// 사용자로부터 다운로드 받을 프로그램 갯수를 입력받아
	// 다운로드 진행창을 출력하시오

	// 사용자로부터 다운로드 받을 프로그램의 개수 입력받는다.
	// [출력양식]
	// n번째 프로그램 다운로드 받습니다.
	// 0% 진행중...
	// 20% 진행중...
	// 40% 진행중...
	// 60% 진행중...
	// 80% 진행중...
	// 100% 진행중...
	// n번째 프로그램 다운로드 완료되었습니다.
	// -------------------------------
	// 모든 프로그램 다운로드 완료
	private static void q2() {
		Scanner sc = new Scanner(System.in);
		// 사용자로 정수를 입력받는다.
		System.out.print("프로그램 개수 : ");
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			System.out.println(i + 1 + "번째 프로그램 다운로드 받습니다.");
			for (int j = 0; j < 6; j++) {
				System.out.println(j * 20 + "% 진행중...");
			}
			System.out.println(i + 1 + "번째 프로그램 다운로드 완료되었습니다.");
			System.out.println("==========================");
		}
		System.out.println("--------------------------");
		System.out.println("모든 프로그램 다운로드가 완료되었습니다.");
	}

	
}
