package com.kh.c_init;

public class Constructor {
	
	// 필드변수
	//	인스턴스변수 : 클래스를 인스턴스화 했을 때 메모리에 올라가는 변수, 인스턴스가 메모리에서 내려오면 함께 정리된다.
	//  클래스 변수	 : 클래스가 메모리에 등록되면 메모리에 올라가는 변수, 프로그램이 종료될 때 까지 메모리에서 내려오지 않는다.
	
	// 필드변수의 초기화 순서 
	// 인스턴스변수 : jvm의 기본값 -> 필드변수에 직접 대입한 값 -> 초기화 블록 -> 생성자
	// 클래스변수 	  : jvm의 기본값 -> 필드변수에 직접 대입한 값 -> static 초기화 블록
	
	private String name = "하명도"; //인스턴스변수
	private static int classCode = 777; //클래스변수
	
	// 생성자 : 클래스가 인스턴스화 될 때 호출되는 메서드
	//			필드변수를 초기화하는 용도로 사용 된다.
	//			만약 다른 생성자가 없는데, 기본 생성자를 작성하지 않으면 JVM이 자동으로 생성한다.
	// 			생성자는 반환형이 없고, 이름은 클래스명과 같다.
	public Constructor() {
		super(); //부모클래스의 생성자를 호출
				 //작성하지 않을 경우 자동으로 생성된다.
		System.out.println("Constructor클래스의 기본 생성자 입니다.");
		System.out.println("생성자가 호출 되기 전 name에 담겨 있는 값 : " + name);
		name = "pclass";
	}
	
	public Constructor(String name) {
		System.out.println("Constructor클래스의 매개변수가 있는 생성자 입니다.");
		System.out.println("생성자가 호출 되기 전 name에 담겨 있는 값 : " + name);
		this.name = name;
	}
	
	// 초기화블록
	// 클래스가 인스턴스화 되는 순간에 한번만 호출되어 인스턴스 변수의 값을 초기화하는 용도
	// 생성자보다 먼저 호출된다.
	{
		System.out.println("초기화 블록 호출 전에 name에 담겨 있는 값 : "  + name);
		name = "강사";
	}
	
	//static 초기화 블록
	//프로그램이 시작 될 때 동작해 static변수에 값을 넣는다.
	static {
		System.out.println("초기화 블록 호출 전에 classCode에 담겨 있는 값 : " + classCode);
		classCode = 100;
	}

	public String getName() {
		return name;
	}

	public static int getClassCode() {
		return classCode;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
