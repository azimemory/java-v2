package com.kh.a_modifier;

public class C_static {
	
	// static : [클래스의, 공통적인] 의 의미를 지니는 제한자
	
	// 변수 앞에 static을 붙이면 해당 변수는 자바의 static영역에 올라가게 된다.	
	
	// static영역에 올라간 데이터는 클래스로더가 클래스를 메모리에 올릴 때 함께 올라가게 되며 
	// 프로그램이 종료 될 때 까지 메모리에서 내려오지 않는다.
	
	// static 변수 또는 메서드는 Type.이름 형태로 사용한다. 
	// 	 ex) Math.PI ,  Math.abs(-100);
	
	//필드변수 
	//멤버변수
	String noneStatic = "Static 아님";
	
	//클래스변수
	public static String staticName = "하명도";
	
	//일반 메서드
	public void methodTest() {
		System.out.println("일반 메서드 입니다.");
	}
	
	//Static 메서드
	public static void staticTest() {
		System.out.println("Static 메서드 입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
