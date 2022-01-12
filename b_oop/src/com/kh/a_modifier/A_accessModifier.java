package com.kh.a_modifier;

public class A_accessModifier {
	
	//제한자(modifier)
	//접근제한자  	:	public, protected, private, default(생략)
	//그 외 제한자 	:	static, final, abstract, void	
	
	// 접근제한자 : 변수나 메서드에 접근하는 권한을 지정하는 제한자.
	//	1) public, 2) default, 3) protected, 4) private
	
	//public(+) : 다른 패키지에서도 이 메서드를 호출 할 수 있음
	public static void publicMethod() {
		System.out.println("접근제한자가 public인 메서드 입니다.");
		privateMethod();
	}
	
	//default(~) : 같은 패키지 내에서만 이 메서드를 호출 할 수 있음.
	//	     접근제한자 default를 사용할 경우 메서드 선언부에서 접근제한자를 생략한다.
	static void defaultMethod() {
		System.out.println("접근제한자가 default인 메서드 입니다.");
	}
	
	//protected(#) : 같은 패키지 내에서 호출 가능, 상속관계일 경우 다른 패키지에서도 호출 할 수 있음
	protected static void protectedMethod() {
		System.out.println("접근제한자가 protected인 메서드 입니다.");
	}
	
	//private(-) : 같은 클래스 안에서만 호출 가능
	private static void privateMethod() {
		System.out.println("접근제한자가 private인 메서드 입니다.");
	}

}
