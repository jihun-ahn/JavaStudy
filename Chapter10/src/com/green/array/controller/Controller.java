package com.green.array.controller;

import com.green.array.dto.Member;
import com.green.array.main.MainArray;
import com.green.array.view.View;

public class Controller {
	public Controller() {
		init();
	}
	
	private void init() {
		while(true) {
			int selectMenu = View.menu();
			
			switch(selectMenu) {
			case 1://회원가입
				Member m = View.signUp();
				if(m==null) {
					View.userError();
				}else {
					for(int i=0;i<MainArray.members.length;i++) {
						if(MainArray.members[i] == null) {
							MainArray.members[i]=m;
							break;
						}
					}
				}
				
				break;
			case 2://로그인
				String[] login = View.signIn();

				int idx = -1;
				for(int i=0;i<MainArray.members.length;i++) {
					if(MainArray.members[i]==null) {
						continue;
					}else if(MainArray.members[i].getId().equals(login[0]) &&
							MainArray.members[i].getPassword().equals(login[1])) {
						//로그인 성공
						task(MainArray.members[i]);
						idx = i;
					}

				}
				if(idx==-1) {
					View.signInFail();
				}				
				break;
			case 3://종료
				if(View.exit()) {
					System.exit(0);
				}
				break;
			default:
				View.userError();
				break;
			}
			
		}
	}

	private void task(Member member) {
		member.work();
		member.test();
	}
}
