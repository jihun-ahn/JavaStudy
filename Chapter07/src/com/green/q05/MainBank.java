package com.green.q05;
import java.util.Scanner;

public class MainBank {
	static Account[] ac = new Account[100]; //100명분을 저장할 수 있는 배열
	static Scanner sc = new Scanner(System.in);
	static int AccountCount=0;
	
	public static void main(String[] args) {
		boolean run = true;
		
		main:
			while(run) {

			System.out.println("그린 뱅크에 오신 것을 환영합니다.");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 업무");
			System.out.println("3. 종료");
			System.out.print(">");
			int selectNum = Integer.parseInt(sc.nextLine());

			switch(selectNum) {
			case 1:
				System.out.println("계좌 생성");
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("계좌번호: ");
				String number = sc.nextLine();
				System.out.print("생성시 입금할 금액: ");
				int balance = Integer.parseInt(sc.nextLine());
				Account newAccount = new Account(name, number, balance);
				
				for(int i=0;i<ac.length;i++) {
					if(ac[i]==null) {
						ac[i]=newAccount;
						break;
					}
				}
				System.out.println("계좌 생성");
				break;
				
				
			case 2:
				int chkAccIdx = -1;
				System.out.println("계좌번호를 입력하세요.");
				String saveNumber = sc.nextLine();
				for(int i=0;i<ac.length;i++) {
					if(ac[i]==null) {
						continue;
					}else if(saveNumber.equals(ac[i].getAccountNum())) {
						chkAccIdx = i;
						break;
					}
				}
				if(chkAccIdx==-1) {
					System.out.println("해당 계좌를 찾을수 없습니다.");
				}else {
					bankFunction(chkAccIdx);
				}
				break;
				
				
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				run=false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 선택해주세요");
				break;
			}

		}
	}

	private static void bankFunction(int chkAccIdx) {
		
		while(true) {
			System.out.println(ac[chkAccIdx].getAccountName()+"님 환영합니다.");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액조회");
			System.out.println("0. 메인메뉴로 돌아가기");
			System.out.print(">");
			int selectNum = Integer.parseInt(sc.nextLine());
			switch(selectNum) {
			case 1:
				System.out.println("입금 금액을 입력하세요.");
				int deposit = Integer.parseInt(sc.nextLine());
				ac[chkAccIdx].deposit(deposit);
				break;				
			case 2:
				System.out.println("출금 금액을 입력하세요.");
				int withdraw = Integer.parseInt(sc.nextLine());
				ac[chkAccIdx].withdraw(withdraw);
				break;				
			case 3:
				ac[chkAccIdx].balanceCheck();
				break;
			case 0:
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 선택해주세요");
				break;
			}

		}
		
		
	}
	
	
}