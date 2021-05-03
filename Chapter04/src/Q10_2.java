import java.util.Scanner;

public class Q10_2 {

	public static void main(String[] args) {
		//게임 회수를 입력받아서 가위바위보 게임을 진행한후
		//최종적으로 승,무,패를 출력하는 프로그램을 만들어 보세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 바위 보 게임을 시작합니다.");
		System.out.println("몇회 게임을 진행하실 건가요?");
		int gameCnt = Integer.parseInt(scan.nextLine());
		int win=0, lose=0, draw=0;

		
		for(int i=1;i<=gameCnt;i++) {
			System.out.println("*** "+i+"번째 게임 ***");
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

			switch(userCommand) {
			case "가위":
				if(comCommand.equals("가위")) {
					System.out.println("비겼습니다.");
					draw++;
				}else if(comCommand.equals("바위")) {
					System.out.println("플레이어가 졌습니다.");
					lose++;
				}else if(comCommand.equals("보")) {
					System.out.println("플레이어가 이겼습니다.");
					win++;
				}
				break;
			case "바위":
				if(comCommand.equals("가위")) {
					System.out.println("플레이어가 이겼습니다.");
					win++;
				}else if(comCommand.equals("바위")) {
					System.out.println("비겼습니다.");
					draw++;
				}else if(comCommand.equals("보")) {
					System.out.println("플레이어가 졌습니다.");
					lose++;
				}
				break;
			case "보":
				if(comCommand.equals("가위")) {
					System.out.println("플레이어가 졌습니다.");
					lose++;
				}else if(comCommand.equals("바위")) {
					System.out.println("플레이어가 이겼습니다.");
					draw++;
				}else if(comCommand.equals("보")) {
					System.out.println("비겼습니다.");
					win++;
				}
				break;
			default:
				System.out.println("잘못 입력했습니다. \n 다시 입력해주세요.");
				i--;
			}
		}
		System.out.printf("승 : %d, 무 : %d, 패 : %d\n", win, draw, lose);
	}

}
