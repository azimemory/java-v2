package com.kh.f_array.coffeeManager;

import java.util.Scanner;

public class CoffeeManager {

	// 배열을 사용해서 코드 줄이기 -> 같이 진행
	// 상품을 동적으로 받도록 리펙토링하는 것은 과제

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 지출, 매출 변수
		int expences = 0; // 지출
		int salesPrice = 0; // 매출

		// 잔고 -> 사용자로부터 입력
		System.out.print("잔고를 등록하세요 : ");
		int balance = sc.nextInt();

		System.out.print("등록할 상품의 개수를 입력하세요 : ");
		int size = sc.nextInt();

		String[] drinkList = new String[size];
		// String[] drinkList = {"아메리카노","모카","라떼"};
		int[] salesCountList = { 0, 0, 0 };
		int[] priceList = new int[size];
		int[] costList = new int[size];
		int[] stockList = new int[size];
		int[] saftyStockList = new int[size];

		for (int i = 0; i < drinkList.length; i++) {
			System.out.println("============================");
			System.out.print("상품명 : ");
			drinkList[i] = sc.next();
			System.out.print(drinkList[i] + " 판매가 : ");
			priceList[i] = sc.nextInt();
			System.out.print(drinkList[i] + " 원가 : ");
			costList[i] = sc.nextInt();
			System.out.print(drinkList[i] + " 재고 : ");
			stockList[i] = sc.nextInt();
			System.out.print(drinkList[i] + " 안전재고 : ");
			saftyStockList[i] = sc.nextInt();
		}

		System.out.println("============================");

		do {
			// 메뉴 출력(do_while)
			// 1.판매 등록, 2.현황, 3.종료
			System.out.println("\n=========Menu=========");
			System.out.println("판매등록(1)");
			System.out.println("현황(2)");
			System.out.println("종료(3)");
			System.out.print("입력 : ");
			int inputMenu = sc.nextInt();

			// 1.판매등록 선택
			if (inputMenu == 1) {
				// 음료 목록 출력
				System.out.println("\n아메리카노(0)");
				System.out.println("모카(1)");
				System.out.println("라떼(2)");
				// 음료의 코드, 판매량 -> 사용자로부터 입력
				System.out.print("\n * 판매한 커피코드 : ");
				int idx = sc.nextInt();
				System.out.print(" * 판매량 : ");
				int orderCnt = sc.nextInt();

				// 아메리카노 선택, 모카 선택, 라떼 선택
				if (idx >= 0 && idx < drinkList.length) {

					if (orderCnt <= stockList[idx]) { // 판매량이 재고보다 적어 정상적인 판매가 진행
						stockList[idx] -= orderCnt; // 재고 - 판매수량
						salesCountList[idx] += orderCnt; // 음료 판매량 + 판매수량
						balance += orderCnt * priceList[idx]; // 잔고 + 판매수량 * 판매가
						salesPrice += orderCnt * priceList[idx]; // 매출 + 판매수량 * 판매가

					} else { // 판매량이 재고보다 많아 재고 부족

						int needMoney = orderCnt * costList[idx];

						if (needMoney <= balance) { // 재고를 매입하는데 필요한 금액이 잔고보다 적어 재고 매입
							System.out.println(" * 재고를 " + orderCnt + "개 추가합니다.");

							balance -= needMoney; // 잔고 - 판매량 * 원가
							stockList[idx] += orderCnt; // 재고 + 판매량
							expences += needMoney; // 지출 + 판매량 * 원가

							// 정상적인 판매로직
							stockList[idx] -= orderCnt; // 재고 - 판매수량
							salesCountList[idx] += orderCnt; // 음료 판매량 + 판매수량
							balance += orderCnt * priceList[idx]; // 잔고 + 판매수량 * 판매가
							salesPrice += orderCnt * priceList[idx]; // 매출 + 판매수량 * 판매가

						} else {
							System.out.println(" * 잔고가 부족해 재고를 추가하지 못했습니다."); // 잔고가 부족해 재고 매입 불가
							System.out.println(" * 주문이 취소 되었습니다.");
							continue;
						}
					}

					// 판매종료
					// 제품명, 판매수량, 결재금액, 남은 재고량 출력
					System.out.println("\n 제품명 : " + drinkList[idx] + " \n 판매가 : " + priceList[idx] + " \n 판매수량 : "
							+ orderCnt + " \n 결재금액 : " + priceList[idx] * orderCnt + " \n 남은 재고 : " + stockList[idx]);

					// 안전재고를 확인
					// 안전재고가 부족한 경우 안전재고 * 2 만큼 재고 확보
					if (stockList[idx] < saftyStockList[idx]) {

						int needMoney = saftyStockList[idx] * 2 * costList[idx];

						if (balance > needMoney) {
							System.out.println(" * " + drinkList[idx] + " 재고가 부족해 안전재고를 확보합니다.");
							balance -= needMoney; // 잔고 - 안전재고 * 2 * 원가
							stockList[idx] += saftyStockList[idx] * 2; // 재고 + 안전재고 * 2
							expences += needMoney; // 지출 + 안전재고 * 2 * 원가
							System.out.println(" * " + drinkList[idx] + " : " + stockList[idx]);
						} else {
							System.out.println(" * 잔고가 부족해 안전재고를 확보하지 못하였습니다.");
						}
					}
				} else {
					System.out.println("존재하지 않는 음료코드 입니다.");
				}
			} else if (inputMenu == 2) {
				// 2. 현황 선택
				// 음료의 재고, 판매량
				// 잔고, 매출, 지출 출력
				System.out.println();
				for (int i = 0; i < drinkList.length; i++) {
					System.out.println(drinkList[i] + " 재고 : " + stockList[i] + " | 판매량 : " + salesCountList[i]);
				}
				System.out.println(" 잔고 : " + balance + " | 매출 : " + salesPrice + " |  지출 : " + expences);

			} else if (inputMenu == 3) {
				// 3. 종료 선택
				System.out.println(" * 프로그램을 종료합니다."); // 프로그램을 종료
				break;
			} else {
				System.out.println(" * 잘못된 번호를 입력하였습니다.");
			}

		} while (true);
	}

}
