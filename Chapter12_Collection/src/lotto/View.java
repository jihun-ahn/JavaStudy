package lotto;

public class View {
	
	public static int mainMenu() {
		System.out.println("*** 로또 ***");
		System.out.println("1. 자동 뽑기");
		System.out.println("2. 여러번 자동 뽑기");
		System.out.println("3. 수동 입력");
		System.out.println("4. 종료");
		System.out.print(">");
		int selectNum = Integer.parseInt(Main.sc.nextLine());
		return selectNum;
	}

	public static boolean programExit() {
		System.out.println("종료하시겠습니까? (y/n)");
		String exitChk = Main.sc.nextLine();
		if(exitChk.equals("Y")||exitChk.equals("y")) {
			return true;
		}else if(exitChk.equals("N")||exitChk.equals("n")) {
			System.out.println("메인 메뉴로 돌아갑니다.");
			return false;
		}else {
			userError();
			return false;
		}
		
	}

	private static void userError() {
		System.out.println("잘못 입력하셨습니다.");
	}

	public static int inputNum() {
		System.out.println("진행할 로또 횟수를 입력하세요.");
		System.out.print(">");
		int num = Integer.parseInt(Main.sc.nextLine());
		return num;
	}

	public static void autoCount(int i) {
		System.out.println((i+1)+"번째 로또");
		
	}

	public static void autoNum(int num) {
		System.out.print("("+num+")");
		}

	public static void auto() {
		System.out.print("자동 뽑기 결과: ");

	}

	public static int manualCount() {
		
		System.out.println("수동으로 입력할 횟수를 입력하세요.");
		System.out.print(">");
		int manualCount = Integer.parseInt(Main.sc.nextLine());
		
		return manualCount;
	}

	public static void manualNumber() {
		
		System.out.println("수동으로 입력할 번호를 입력하세요.");
		
	}
}