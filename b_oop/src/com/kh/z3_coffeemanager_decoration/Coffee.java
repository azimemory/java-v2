package com.kh.z3_coffeemanager_decoration;

public class Coffee {

	protected String name;//이름
	protected int price;//판매가
	protected int cost;//매입가
	protected int stock;//재고
	protected int safetyStock;//안전재고
	protected int totalSaleCnt;//누적 판매량
	
	public Coffee() {
		
	}

	public Coffee(String name, int price, int cost, int stock, int safetyStock) {
		super();
		this.name = name;
		this.price = price;
		this.cost = cost;
		this.stock = stock;
		this.safetyStock = safetyStock;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getCost() {
		return cost;
	}

	public int getStock() {
		return stock;
	}

	public int getSafetyStock() {
		return safetyStock;
	}

	public int getTotalSaleCnt() {
		return totalSaleCnt;
	}

	//외부로 부터 커피판매등록 메세지를 전달받을 메서드
	//판매를 등록하고 결제금액을 반환
	public int registerSales(int salesCnt, Account account) {

		//결재금액 : 판매가 * 재고를 차감한 수
		//			 판매성공 : 금액
		//			 판매실패 : 0
		int payPrice = price * deductStock(salesCnt, account);

		//결재금액이 0원이면 결재에 실패한 상황
		if (payPrice == 0) {
			return 0;
		}

		totalSaleCnt += salesCnt; //누적판매량 추가
		
		if (stock < safetyStock) { //재고 차감 이후 재고가 안전재고보다 적다면 안전재고 확보
			addSafetyStock(account);
		}

		return payPrice;
	}
	
	public int registerRefund(int refundCnt, Account account) {
		int refundPrice = refundCnt * price;
		
		//누적 판매량이 환불수량 보다 적다면
		if(totalSaleCnt < refundCnt) {
			System.out.println(" * 누적 판매량을 초과하여 환불할 수 없습니다.");
			return 0;
		}
		
		addStock(refundCnt, refundPrice, account);
		totalSaleCnt -= refundCnt;

		return refundPrice;
	}

	// 재고를 차감하고 차감한 재고의 수를 반환
	protected int deductStock(int salesCnt, Account account) {
		
		//	재고가 판매량보다 많거나 같다면 재고에서 판매량만큼 차감
		int preExpencesPrice = salesCnt * cost - salesCnt * price; //들어올 금액을 선반영하여 산정
		int expencesPrice = 0; //실제 지출 금액
		
		if (stock >= salesCnt) {
			stock -= salesCnt;
		} else if ((expencesPrice = addStock(salesCnt, preExpencesPrice, account)) > 0) {
			account.registerExpences(expencesPrice);
			stock -= salesCnt;
		} else {
			return 0;
		}

		return salesCnt; //차감한 재고의 수
	}

	//판매가 정상적으로 진행되면 안전재고확보, 확보한 재고 수를 반환
	protected int addSafetyStock(Account account) {
		System.out.println(" * 안전재고가 부족해 안전재고를 확보합니다.");
		
		int needCnt = safetyStock * 2;
		int preExpencesPrice = needCnt * cost - needCnt * price; //들어올 금액을 선반영하여 산정
		int expencesPrice = cost *  addStock(needCnt, preExpencesPrice, account);
		account.registerExpences(expencesPrice);
		
		return needCnt;
	}

	//재고 추가 - 재고 사입
	//재고를 추가하고 추가한 재고의 수를 반환
	protected int addStock( int needCnt, int expencesPrice, Account account) {
		if (account.isExpendable(expencesPrice)) { 
			stock += needCnt;
			System.out.println(" * 재고를 " + needCnt + "개 추가 합니다.");
			return needCnt;
		} else {
			System.out.println(" * 잔고가 부족해 재고를 추가하지 못했습니다.");
			return 0; //재고를 추가하지 못해 재고를 차감하는 데 실패
		}
	}
	

}
