package com.green.q05;

public class Account {
	private String name;
	private String AccountNumber;
	private int balance;
	
	public Account(String name, String number, int balance){
		this.name = name;
		AccountNumber = number;
		this.balance = balance;
		
		System.out.println("계좌 생성 완료");
		System.out.println("이름: "+this.name);
		System.out.println("계좌 번호 "+AccountNumber);
		System.out.println("잔액 "+this.balance);
	}
	
	public void deposit(int depositMoney) { //입금
		balance+=depositMoney;
		System.out.println(depositMoney+"원 입금합니다.");
		System.out.println("잔액: "+balance+"원");
	}
	
	public void withdraw(int withdrawMoney) {
		if(balance>=withdrawMoney) {	//출금
			balance-=withdrawMoney;
			System.out.println(withdrawMoney+"원 출금합니다.");
			System.out.println("잔액: "+balance+"원");
		}else {
			System.out.println("잔액 부족");
			System.out.println("잔액: "+balance+"원");
		}
	}
	
	public void balanceCheck() {
		System.out.println("잔액: "+balance+"원");
	}
	public String getAccountNum() {
		return AccountNumber;
	}
	public String getAccountName() {
		return name;
	}


}
