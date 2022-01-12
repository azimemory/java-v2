package com.kh.b_encapsulation;

public class Run {
	public static void main(String[] args) {
		
		//객체를 생성해주는 메서드인 생성자를 호출, 생성자의 이름은 클래스명과 동일
		Account lecturAccount = new Account(); 
		
//		lecturAccount.name = "하명도";
//		lecturAccount.id = "000000-000000";
//		lecturAccount.balance = -1000000; 	캡슐화가 되어있지 않기 때문에 이런 말도 안되는 일이 발생
		
		//이름
		//setter메서드를 활용해서 name속성에 값을 대입
		lecturAccount.setName("하명도");
		
		//잔액
		lecturAccount.setBalance(1000);
		
		//50000원 입금
		lecturAccount.deposit(50000);
		
		//잔고확인
		//getter메서드를 활용해서 이름과 잔액을 확인
		System.out.println(lecturAccount.getName()  	+ "의 잔액 : " + lecturAccount.getBalance());
		System.out.println("강사 계좌 주소 값 : " + 	System.identityHashCode(lecturAccount));
		System.out.println("\n==============================");
		
		
		//학생 계좌
		Account studentAccount = new Account();
		studentAccount.setName("학생");
		studentAccount.setBalance(100000000);
		studentAccount.withdraw(50000);
		System.out.println(studentAccount.getName() + "의 잔액은 " + studentAccount.getBalance() + "원 입니다.");
		
		/////////////////////////////////////////////////////
		
		System.out.println("====================================");
		
		//참치회를 먹었다는 이야기를 듣고 국밥 드립을 치는 k씨
		KookBabDreeper k = new KookBabDreeper();
		k.setFoodName("참치회");
		k.setFoodPrice(50000);
		k.dreep();
		
		//떡볶이를 먹었다는 이야기를 듣고 국밥 드립을 치는 l씨
		KookBabDreeper l = new KookBabDreeper();
		l.setFoodName("떡볶이");
		l.setFoodPrice(4500);
		l.dreep();
		

		
		
		
		
		
		
		
		
		
		
		
		

	}
}
