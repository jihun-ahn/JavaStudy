import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Member[] m = new Member[100];
	static boolean loginCheck = false;
	static int memberNumber=0;
	static int memberPtr=0;

	public static void main(String[] args) {

		boolean run = true;
		while(run) {

			int selectNum = mainMenu();

			switch(selectNum) {
			case 1:
				signup();
				break;
			case 2:
				login();
				break;
			case 3:
				exitprogram();
				break;
			case 4:
				logout();
				break;
			case 5:
				ptr();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}
	}

	private static void ptr() {
		System.out.println("이름: "+m[memberPtr].memberName);
		System.out.println("전화번호: "+m[memberPtr].memberNum);
	}


	private static void logout() {
		System.out.println("로그아웃 되었습니다.");
		loginCheck=false;

	}

	private static void exitprogram() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);		
	}


	private static void login() {
		int login=-1;
		if(loginCheck==false) {
			System.out.print("아이디: ");
			String id = sc.nextLine();
			System.out.print("비밀번호: ");
			String password = sc.nextLine();
			for(int i=0;i<memberNumber;i++) {
				if((id.equals(m[i].memberId)) && (password.equals(m[i].memberPassword))) {
					System.out.println("로그인 성공");
					loginCheck=true;
					memberPtr=i;
					login=i;
					break;
				}
			}
			if(login==-1) {
				System.out.println("등록된 아이디가 없거나 비밀번호가 틀립니다.");
			}

		}else {
			System.out.println("이미 로그인 되어있습니다.");
		}
	}


	private static void signup() {
		boolean run = true;
		System.out.println("멤버 수: "+memberNumber);
		if(loginCheck==false) {


		re:
			while(run) {
			System.out.println("회원 가입");
			System.out.print("아이디: ");
			String id = sc.nextLine();
			for(int i=0;i<memberNumber;i++) {
				if(id.equals(m[i].memberId)) {
					System.out.println("등록된 아이디가 존재합니다.");
					run=false;
					break re;
				}
			}
			System.out.print("비밀번호: ");
			String password = sc.nextLine();
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("전화번호: ");
			String num = sc.nextLine();

			m[memberNumber] = new Member(id, password, name, num);
			memberNumber++;
			run=false;
			}
		}else {
			System.out.println("로그아웃 후 진행하십시오.");
		}
	}
	private static int mainMenu() {
		if(loginCheck==true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			System.out.println("4. 로그아웃");
			System.out.println("5. 이름과 전화번호 확인");
		}else {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
		}
		System.out.print(">");
		int selectNum = Integer.parseInt(sc.nextLine());

		return selectNum;

	}


}
