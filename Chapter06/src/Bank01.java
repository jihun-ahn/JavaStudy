import java.util.Scanner;

public class Bank01 {
	static Scanner sc = new Scanner(System.in);
	//chapter04의 Q11 문제와 비교해보세요.
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;			//잔액
		while(run) {
			int selectNum = menu();
			switch(selectNum) {
			case 1: //예금 기능
				balance = deposit(balance);
				break;
			case 2: // 출금 기능
				balance = withdraw(balance);
				break;
			case 3: // 잔액 조회 기능
				check(balance);
				break;
			case 4: // 프로그램 종료
				run = exitprogram();				
				break;
			default: 
				error();
				continue;
			}
		}
	}
	private static boolean exitprogram() {
		System.out.println("프로그램을 종료합니다.");
		return false;

	}
	private static void error() {
		System.out.println("잘못 입력 했습니다. 다시 선택 해주세요.");

	}
	private static int deposit(int balance) {
		System.out.println("예금 하실 금액을 입력하세요.");
		System.out.print(">");
		int deposit = Integer.parseInt(sc.nextLine());
		if((balance+deposit)>1000000) {
			System.out.println("예금이 불가합니다.(잔액 초과)");			
		}else {
		balance += deposit;
		System.out.printf("%d원 예금 완료\n", deposit);
		
		}
		return balance;
	}
	private static int withdraw(int balance) {
		System.out.println("출금 하실 금액을 입력하세요.");
		System.out.print(">");
		int withdraw = Integer.parseInt(sc.nextLine());
		if(withdraw<=balance) {
			System.out.printf("%d원 출금 완료\n", withdraw);
			balance-=withdraw;
		}else {
			System.out.println("잔액 부족");
			System.out.printf("잔액 : %d 원\n", balance);
		}

		return balance;
	}
	
	private static void check(int balance) {
		System.out.println("잔고 : "+balance+"원");

	}
	public static int menu() {
		System.out.println("그린 뱅크에 오신 것을 환영합니다.");
		System.out.println("1. 예금");
		System.out.println("2. 출금");
		System.out.println("3. 잔액조회");
		System.out.println("4. 종료");
		System.out.print(">");

		int selectNum = Integer.parseInt(sc.nextLine());
		return selectNum;
	}


}
