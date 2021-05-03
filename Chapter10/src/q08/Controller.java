package q08;

import java.util.Iterator;

public class Controller {
	public void init() {
		boolean run = true;
		while(run) {
			int selectNum = View.mainMenu();	//메인메뉴 호출
			switch(selectNum) {					//메인메뉴 선택
			case 1:
				View.signUp();					//회원가입
				break;
			case 2:
				View.logInTeacher();			//교직원 로그인
				break;
			case 3:
				View.logInStudent();			//학생 로그인
				break;
			case 4:
				View.programExit();				//프로그램 종료
				break;
			default:
				View.nullSelect();
				break;
			}
		}
	}
	
	public static int teacherChk(String id) {	//교직원 아이디 중복확인 메소드
		Iterator<Teacher> itrT = Main.teacher.iterator();
		int chk=0;
		while(itrT.hasNext()) {
			Teacher idT = itrT.next();
			if(id.equals(idT.getId())){
				chk=-1;
				break;
			}
		}
		return chk;
	}
	public static int studentChk(String id) {	//학생 아이디 중복확인 메소드
		Iterator<Student> itrS = Main.student.iterator();
		int chk=0;
		while(itrS.hasNext()) {
			Student idS = itrS.next();
			if(id.equals(idS.getId())){
				chk=-1;
				break;
			}
		}
		return chk;
	}

	public static void programExit(String exitChk) {	//프로그램 종료 메소드
		if(exitChk.equals("y")||exitChk.equals("Y")) {
			System.exit(0);
		}else if(exitChk.equals("n")||exitChk.equals("N")) {

		}else {
			View.nullSelect();
		}		
	}
	
	
	
	
	
	
	
}
