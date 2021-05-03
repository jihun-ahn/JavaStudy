package q08;

import java.util.Iterator;

public class View {

	public static int mainMenu() {	//메인메뉴 메소드
		System.out.println("학사 정보 관리 시스템");
		System.out.println("1. 회원가입");
		System.out.println("2. 직원 로그인");
		System.out.println("3. 학생 로그인");
		System.out.println("4. 프로그램 종료");
		System.out.print(">");
		int selectNum = Integer.parseInt(Main.sc.nextLine());
		return selectNum;
	}
	
	
	public static void signUp() {	//회원가입 메소드
		System.out.println("회원 가입");
		System.out.print("이름: ");
		String name = Main.sc.nextLine();
		System.out.print("아이디: ");
		String id = Main.sc.nextLine();
		System.out.print("비밀번호: ");
		String password = Main.sc.nextLine();
		System.out.print("직업: ");
		String job = Main.sc.nextLine();
		if(job.equals("교직원")){
			int chk = Controller.teacherChk(id);	//교직원 아이디 중복확인 호출
			if(chk==0) {
				System.out.print("담당 과목: ");
				String subject = Main.sc.nextLine();
				Main.teacher.add(new Teacher(name, id, password, subject));
			}else {
				overlapId();
			}

		}else if(job.equals("학생")) {
			int chk = Controller.studentChk(id);	//학생 아이디 중복확인 호출
			if(chk==0) {
				System.out.print("전공: ");
				String subject = Main.sc.nextLine();
				Main.student.add(new Student(name, id, password, subject));
			}else {
				overlapId();
			}			
		}else {
			nullSelect();
		}
	}
		
	public static void logInTeacher() {			//교직원 로그인
		Iterator<Teacher> itrT = Main.teacher.iterator();
		System.out.println("교직원 로그인");
		System.out.print("아이디: ");
		String id = Main.sc.nextLine();
		System.out.print("비밀번호: ");
		String password = Main.sc.nextLine();
		int logChk = -1;
		while(itrT.hasNext()) {
			Teacher idT = itrT.next();
			if((id.equals(idT.getId()))&&(password.equals(idT.getPassword()))){
				System.out.println("교직원 로그인 성공");
				System.out.println("이름: "+idT.getName());
				System.out.println("담당 과목: "+idT.getSubject());
				idT.work();
				idT.test();
				
				logChk = 0;
				break;
			}
		}
		if(logChk==-1) {
			logInFail();
		}

	}
	
	
	public static void logInStudent() {			//학생 로그인
		Iterator<Student> itrS = Main.student.iterator();
		System.out.println("학생 로그인");
		System.out.print("아이디: ");
		String id = Main.sc.nextLine();
		System.out.print("비밀번호: ");
		String password = Main.sc.nextLine();
		int logChk = -1;
		while(itrS.hasNext()) {
			Student idS = itrS.next();
			if((id.equals(idS.getId()))&&(password.equals(idS.getPassword()))){
				System.out.println("학생 로그인 성공");
				System.out.println("이름: "+idS.getName());
				System.out.println("전공: "+idS.getSubject());
				idS.work();
				idS.test();
				logChk = 0;
				break;
			}
		}
		if(logChk==-1) {
			logInFail();
		}

	}	
	public static void programExit() {			//프로그램 종료
		System.out.println("프로그램을 종료하시겠습니까? (y/n)");
		System.out.print(">");
		String exitChk = Main.sc.nextLine();
		Controller.programExit(exitChk);
	}
	
	private static void logInFail() {
		System.out.println("로그인에 실패했습니다.");
		System.out.println("아이디 또는 비밀번호를 확인해주세요.");
	}

	static void nullSelect() {
		System.out.println("잘못 입력하셨습니다.");
	}


	public static void overlapId() {
		System.out.println("중복된 아이디가 존재합니다.");
	}

	
}
