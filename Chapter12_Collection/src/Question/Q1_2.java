package Question;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Q1_2 {
	static Random r = new Random();
	static TreeSet<Integer> lotto = new TreeSet<>();
	static Scanner s = new Scanner(System.in);
	static int gameNo = 1;

	public static void main(String[] args) {
//		1-2. 번호를 수동으로 입력받고 나머지 번호는 자동으로 뽑도록 만들어 보세요.
		
		boolean run = true;
		while(run) {
			System.out.println("로또 뽑기 프로그램");
			System.out.println("1. 게임수(입력이 없으면 1회)");
			System.out.println("2. 자동");
			System.out.println("3. 수동");
			System.out.println("4. 프로그램 종료");
			
			int selectMenu = Integer.parseInt(s.nextLine());
			
			switch(selectMenu){
			case 1:// 게임 수 입력
				inputGameNumber();
				break;
			case 2:// 자동
				gameAuto();
				break;
			case 3:// 수동
				gameManual();
				break;
			case 4:// 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 확인 해 주세요.");
				
			}
		}
	}

	private static void gameManual() {
		System.out.println(gameNo+"회 게임을 진행합니다.");
		for(int i=0;i<gameNo;i++) {
			System.out.println((i+1)+"회 게임");
			manual(); //수동으로 로또 뽑는 기능
			lottoPrt();// 뽑은 로또는 출력하고 번호를 초기화
		}
	}

	private static void manual() {
		while(lotto.size()<6) {
			System.out.println("로또 번호를 선택하세요 (1~45)");
			System.out.println("0번을 입력하면 나머지 번호는 자동으로 뽑습니다.");
			System.out.print("입력>");
			int num = Integer.parseInt(s.nextLine());
			
			if(num==0) {
				System.out.println("나머지 번호는 자동으로 뽑습니다.");
				auto();
			}else if(chk45(num)) {// 입력한 숫자가 1~45까지가 맞는 지 체크
				System.out.println("잘못 입력했습니다.");
				System.out.println("1부터 45까지의 숫자를 입력해 주세요.");
			}else if(chkSet(num)) {// 중복 숫자를 입력했을 때
				System.out.println("번호가 중복됩니다.");
				System.out.println("다시 확인하고 입력해주세요.");
			}else {
				lotto.add(num);
			}
			
		}
	}

	private static boolean chk45(int num) {
		if(1 <= num && num <= 45) {
			return false;
		}else {
			return true;
		}
	}

	private static boolean chkSet(int num) {
		for(int lottoNum:lotto) {
			if(lottoNum == num) {
				return true;
			}
		}
		return false;
	}

	private static void gameAuto() {
		System.out.println(gameNo+"회 게임을 진행합니다.");
		for(int i=0;i<gameNo;i++) {
			System.out.println((i+1)+"회 게임");
			auto();// 자동으로 로또는 뽑는 기능
			lottoPrt();// 뽑은 로또는 출력하고 번호를 초기화
		}
		
	}

	private static void lottoPrt() {
		int cnt = 1;
		for(int num:lotto) {
			if(cnt==6) {
				System.out.print(num);
			}else {
				System.out.print(num+",");
			}
			cnt++;
		}
		lotto.clear();
		System.out.println("\n----------------------");
	}

	private static void auto() {
		while(lotto.size()<6) {
			lotto.add(r.nextInt(45)+1);
		}
	}

	private static void inputGameNumber() {
		System.out.println("게임수를 입력하세요.");
		System.out.println("(입력이 없는 경우 기본 1회)");
		System.out.print("입력>");
		int num = Integer.parseInt(s.nextLine());
		
		if(0<num) {
			gameNo = num;
		}else {
			System.out.println("잘못입력했습니다.");
			System.out.println("게임 회수는 1회로 고정합니다.");
		}
	}

}



















