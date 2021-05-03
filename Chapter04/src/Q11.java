import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		//은행 문제
		//1. 예금 2. 출금 3. 잔액조회 4. 종료
		//각 메뉴 선택시 해당 기능이 작동하도록 프로그램 작성
		//예금 선택시 입금 금액을 입력하면 "예금완료"메시지 출력 후 다시 메뉴 호출
		//출금 선택시 출금 금액을 입력하면 잔액과 비교해서 잔액보다 많은 금액 출금시 "잔액 부족"
		//잔액이 많은 경우 "출금 완료" 출력 후 다시 메뉴 호출
		//잔액조회 선택시 "잔고 : XXX원" 출력 후 다시 메뉴 호출
		//종료 선택시 "프로그램을 종료합니다" 메시지 출력 후 프로그램 종료
		//그 외 메뉴 선택 시 "잘못 입력 했습니다. 다시 선택 해주세요." 
		//메시지 출력 후 다시 메뉴 호출
		
		int balance = 0;			//잔액
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("그린 뱅크에 오신 것을 환영합니다.");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">");
			
			int selectNum = Integer.parseInt(sc.nextLine());
			
			switch(selectNum) {
			case 1: //예금 기능
				System.out.println("예금 하실 금액을 입력하세요.");
				System.out.print(">");
				int deposit = Integer.parseInt(sc.nextLine());
				balance += deposit;
				System.out.printf("%d원 예금 완료\n", deposit);
				break;
			case 2: // 출금 기능
				System.out.println("출금 하실 금액을 입력하세요.");
				System.out.print(">");
				int withdrawal = Integer.parseInt(sc.nextLine());
				if(withdrawal<=balance) {
					System.out.printf("%d원 출금 완료\n", withdrawal);
					balance-=withdrawal;
				}else {
					System.out.println("잔액 부족");
					System.out.printf("잔액 : %d 원\n", balance);
				}
				break;
			case 3: // 잔액 조회 기능
				System.out.println("잔고 : "+balance+"원");
				break;
			case 4: // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			default: 
				System.out.println("잘못 입력 했습니다. 다시 선택 해주세요.");
				continue;
				}
			
			if(selectNum==4) {
				break;
			}
			
		}

	}

}
