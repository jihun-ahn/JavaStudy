import java.util.Scanner;

public class Q10_1 {

	public static void main(String[] args) {
		//10번 문제
//		Scanner rps = new Scanner(System.in);
//		Random cpu = new Random();
//		System.out.println("가위 바위 보 중 하나를 입력하세요");
//		System.out.print("나 : ");
//		String userRps = rps.nextLine();
//		int cpuRpsInt = cpu.nextInt(3);
//		int userRpsInt;
//		String cpuRpsStr;
//
//		if(userRps.equals("가위")) {	// 0가위 / 1바위 / 2보
//			userRpsInt = 0;
//		}else if(userRps.equals("바위")) {
//			userRpsInt = 1;
//		}else if(userRps.equals("보")){
//			userRpsInt = 2;
//		}else {
//			userRpsInt = 3;
//		}
//		switch(cpuRpsInt) {
//		case 0:
//			cpuRpsStr = "가위";
//			break;
//		case 1:
//			cpuRpsStr = "바위";
//			break;
//		case 2:
//			cpuRpsStr = "보";
//			break;
//		default:
//			cpuRpsStr = "오류";
//		}
//		int result = (userRpsInt-cpuRpsInt);
//		String resultStr;
//		if(userRpsInt==3) {
//			System.out.println("오류");
//		}else {
//			switch(result) {
//			case -2: case 1:
//				resultStr = "승";
//				break;
//			case -1: case 2:
//				resultStr = "패";
//				break;		
//			case 0:
//				resultStr = "무";
//				break;
//			default :
//				resultStr = "오류";
//			}
//			System.out.println("컴퓨터 : "+cpuRpsStr);
//			System.out.println(resultStr);


		Scanner scan = new Scanner(System.in);
		System.out.println("가위 바위 보 게임을 시작합니다.");
		int com = (int)(Math.random()*3);
		String comCommand = "";
		switch(com) {
		case 0: comCommand = "가위";
		break;
		case 1: comCommand = "보";
		break;
		case 2: comCommand = "바위";
		break;
		}
		System.out.println("가위 바위 보 중 하나를 입력하세요");
		System.out.println("단, 그 외 문자를 입력하면 종료합니다.");
		String userCommand = scan.nextLine();

		//		if((userCommand!="가위")&&(userCommand!="바위")&&(userCommand!="보")) {
		//			System.out.println("잘못 입력했습니다. \n 프로그램을 종료합니다.");
		//			System.exit(0);
		switch(userCommand) {
		case "가위":
			if(comCommand.equals("가위")) {
				System.out.println("비겼습니다.");
			}else if(comCommand.equals("바위")) {
				System.out.println("플레이어가 졌습니다.");
			}else if(comCommand.equals("보")) {
				System.out.println("플레이어가 이겼습니다.");
			}
			break;
		case "바위":
			if(comCommand.equals("가위")) {
				System.out.println("플레이어가 이겼습니다.");
			}else if(comCommand.equals("바위")) {
				System.out.println("비겼습니다.");
			}else if(comCommand.equals("보")) {
				System.out.println("플레이어가 졌습니다.");
			}
			break;
		case "보":
			if(comCommand.equals("가위")) {
				System.out.println("플레이어가 졌습니다.");
			}else if(comCommand.equals("바위")) {
				System.out.println("비겼습니다.");
			}else if(comCommand.equals("보")) {
				System.out.println("플레이어가 이겼습니다.");
			}
			break;
		default:
			System.out.println("잘못 입력했습니다. \n 프로그램을 종료합니다.");
			System.exit(0);
		}
	}
}

