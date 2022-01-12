package com.kh.c_operator;

import java.util.Scanner;

public class E_논리연산자 {
	
	//논리연산자 : && , ||
	// &&(그리고, ~면서) : 두 항이 다 true일 때 true
	// ||(또는, ~거나) :  두 항이 다 false 일 때 false
	public static void main(String[] args) {
		
		// || or 두 항이 모두 false일 때만 false
		// || 연산의 경우 앞의 연산에서 true가 나오면 이후 연산은 수행하지 않는다.
		System.out.println(2 >= 2 || 2 > 3); //true || false
		System.out.println(2 > 1 || 3 > 2); //true || true
		System.out.println(3 < 2 || 2 > 1); //false || true
		System.out.println(3 < 2 ||  2 < 1); //false || false
		
		System.out.println("=================================");
		
		//&& and 두 항이 모두 true일 때만 true
		System.out.println(3 < 2 && 2 > 1); //false && true
		System.out.println(3 < 2 && 2 < 1); //false && false
		System.out.println(3 > 2 && 2 < 1); //true && false
		System.out.println(3 > 2 && 2 > 1); //true && true
	}

	public void quize(){
		
		// 논리연산에서 &&가 || 보다 우선 순위가 높다.		
		boolean a = true;
		boolean b = false;
		boolean c = false;
		boolean d = false;
	
		//아래 논리연산의 출력값을 예상해 보시오
		System.out.println(a || b && c || d); //결과 : true
		
		// 만약 왼쪽부터 수행이 된다면...
		// a || b  -> true
		// false && false -> false
		// false || false -> false
		// 결과가 false가 나와야 한다. 하지만 결과는 true
		
		//논리연산자에서는 &&가 || 보다 연산 우선순위가 높기 때문!		
		
		// 1. 먼저 && 연산을 수행
		// b && c  -> false && false (결과 :  false)
		
		// 2. 왼쪽부터 || 연산 수행 시작
		// a || false -> true || false (결과 : true)
		// true || d -> true || false (결과 : true)
	}
}
