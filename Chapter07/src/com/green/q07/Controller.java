package com.green.q07;
//메인 기능
public class Controller {

	public Controller() {
		init();		
	}

	private void programStart() {//로그인 성공후 작성할 코드
		//메뉴 1. 로그인 정보, 2. 로그아웃 
		boolean run = true;
		int selectNum = View.login();
		while(run) {
			switch(selectNum) {
			case 1:
				View.userPtr();
				break;
			case 2:
				View.logout();
				break;
			case 3:
				run = View.programExit();
				break;
			default:
				View.userfault();
			}
		}
	}

	private void init() {
		boolean run = true;

		while(run) {
			int selectNum = View.menu();

			switch(selectNum) {
			case 1:
				Member member = View.signUp();

				int chk = -1;

				for(int i=0;i<Main.members.length;i++) {
					if(Main.members[i]==null) {
						Main.members[i]=member;
						chk = i;
						break;
					}
				}
				if(chk==-1) {
					View.deadline();
				}
				break;
			case 2:
				int idx = -1;
				String[] account = View.signIn();
				for(int i=0;i<Main.members.length;i++) {
					if(Main.members[i]==null) {
						continue;
					}else if(Main.members[i].getUserId().equals(account[0])&&
							Main.members[i].getUserPassword().equals(account[1])) {
						idx=i;		
						View.success(i);
						Main.session = i;
						break;
					}
				}
				if(idx==-1) {
					View.fail();
				}
				break;
			case 3:
				run = View.programExit();
				break;
			default:
				View.userfault();
			}
		}

	}



}
