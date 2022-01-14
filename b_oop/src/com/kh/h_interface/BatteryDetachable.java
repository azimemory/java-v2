package com.kh.h_interface;

//인터페이스는 인터페이스를 구현하는 모든 클래스들이 지켜야하는 공통의 규약이다.
//인터페이스도 인터페이스를 생성할 때 인터페이스 명과 똑같은 이름의 타입이 생성된다.
//인터페이스는 인스턴스를 생성할  수 없다.
// * interface는 다중구현이 가능하다.
public interface BatteryDetachable {
	
	//인터페이스의 필드변수는 묵시적으로 public static final이다.
	String ABOUT_INFO = "베터리를 탈부착 할 수 있는 제품입니다.";
	
	//인터페이스의 메서드는 묵시적으로 public abstract메서드이다.
	void detacheBattery();
	
	void attacheBattery();
	
	//default메서드가 자바 1.8에서 도입된다.
	//인터페이스 내에서 구현부를 가진 메서드
	default void info() {
		System.out.println("인스턴스를 통해서만 호출이 가능합니다.");
		System.out.println(ABOUT_INFO);
	}
	
	//타입으로 접근하는 static 메서드
	static void information() {
		System.out.println("인터페이스 타입만을 통해서도 호출이 가능합니다.");
		System.out.println(ABOUT_INFO);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
