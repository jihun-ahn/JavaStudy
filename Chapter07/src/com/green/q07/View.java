package com.green.q07;

public class View {

	public static int menu() {
		System.out.println("그린 사이트에 오신것을 환영합니다.");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.print(">");

		int selectNum = Integer.parseInt(Main.sc.nextLine());

		return selectNum;
	}
	public static void userfault() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해 주세요.");
	}
	public static boolean programExit() {
		System.out.println("프로그램을 종료 하시겠습니까? (y/n)");
		System.out.print(">");
		String endCode = Main.sc.nextLine();
		if(endCode.equals("y")||endCode.equals("Y")) {
			return false;
		}else if(endCode.equals("n")||endCode.equals("N")){
			return true;
		}else {
			userfault();
		}while(true);
	}
	public static Member signUp() {
		System.out.println("*** 회원 가입 ***");
		System.out.println("아이디를 입력하세요.");
		String id = Main.sc.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String password = Main.sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = Main.sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String phoneNumber = Main.sc.nextLine();

		Member member = new Member(id, password, name, phoneNumber);

		return member;
	}
	public static void deadline() {
		System.out.println("회원가입이 마감 되었습니다.");
		System.out.println("나중에 다시 찾아와 주십시오.");

	}
	public static String[] signIn() {
		String[] account = new String[2];
		System.out.println("***  로그인  ***");
		System.out.println("아이디를 입력하세요.");
		account[0] =Main.sc.nextLine(); 
		System.out.println("비밀번호를 입력하세요.");
		account[1] =Main.sc.nextLine();

		return account;
	}
	public static void success(int i) {
		System.out.println("로그인에 성공했습니다.");

	}
	public static void fail() {
		System.out.println("로그인에 실패했습니다.");
		System.out.println("아이디 또는 비밀번호를 다시 확인해주세요.");		
	}
	public static int login() {
		System.out.println("1. 유저 정보");
		System.out.println("2. 로그아웃");
		System.out.println("3. 프로그램 종료");
		System.out.print(">");

		int selectNum = Integer.parseInt(Main.sc.nextLine());
		
		return selectNum;		
		
	}
	public static void userPtr() {
		System.out.println("유저 정보");
		System.out.println("이름: "+Main.members[Main.session].getUserName());
		System.out.println("전화번호: "+Main.members[Main.session].getUserPhoneNumber());
		
	}
	public static void logout() {
		
		
	}

}


