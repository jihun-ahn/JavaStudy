package com.green.array.view;

import com.green.array.dto.Member;
import com.green.array.dto.Student;
import com.green.array.dto.Teacher;
import com.green.array.main.MainArray;

public class View {

	public static int menu() {
		System.out.println("학사 정보 관리 시스템");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 회원 가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		int selectMenu = Integer.parseInt(MainArray.sc.nextLine());
		return selectMenu;
	}
	public static Member signUp() {
		Member m = null;
		System.out.println("회원 가입을 진행합니다.");
		System.out.println("ID를 입력하세요.");
		String id = MainArray.sc.nextLine();
		System.out.println("암호를 입력하세요.");
		String password = MainArray.sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = MainArray.sc.nextLine();
		
		System.out.println("1. 선생님 | 2. 학생");
		int selectPosition = Integer.parseInt(MainArray.sc.nextLine());
		
		if(selectPosition == 1) {
			System.out.println("담당 과목을 입력하세요.");
			String subject = MainArray.sc.nextLine();
			
			m = new Teacher(name, id, password, subject);
		}else if(selectPosition == 2) {
			System.out.println("전공을 입력하세요.");
			String major = MainArray.sc.nextLine();
			
			m = new Student(name, id, password, major);
		}else {
			
		}
		return m;
	}

	public static String[] signIn() {
		String[] login = new String[2];
		System.out.println("로그인 절차를 진행합니다.");
		System.out.println("ID를 입력하세요.");
		login[0]=MainArray.sc.nextLine();
		System.out.println("암호를 입력하세요.");
		login[1]=MainArray.sc.nextLine();
		
		return login;
	}
	

	public static void userError() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해주세요.");
	}

	public static boolean exit() {
		System.out.println("프로그램을 종료하시겠습니까? (y/n)");
		String exitAnswer = MainArray.sc.nextLine();
		
		if(exitAnswer.equals("Y")||exitAnswer.equals("y")) {
			System.out.println("프로그램을 종료합니다.");
			System.out.println();
			return true;
		}else if(exitAnswer.equals("N")||exitAnswer.equals("n")) {
			System.out.println("프로그램을 종료하지 않습니다.");
			System.out.println();
			return false;
		}else {
			userError();
			return false;
		}
		
	}
	public static void signInFail() {
		System.out.println("로그인 실패");
		System.out.println("아이디 또는 암호를 확인해주세요.");		
	}


}
