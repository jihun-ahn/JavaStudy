package Question08;

public class ViewMember {
	public static int menu() {
		System.out.println("게시판 메인 메뉴");
		System.out.println("1. 게시글 보기");
		System.out.println("2. 내 게시글 보기");
		System.out.println("3. 글 작성");
		System.out.println("4. 글 수정");
		System.out.println("5. 글 삭제");
		System.out.println("6. 로그아웃");
		System.out.print(">");

		return Controller.inputNum();
	}



	public static void signUp() {
		String id, password, name;
		int idChk=-1;
		System.out.println("회원 가입");
		while(true) {
			System.out.print("아이디: ");
			id = Main.sc.nextLine();
			if(Main.members.size()>=1) {
				for(int i=0;i<Main.members.size();i++) {
					if(id.equals(Main.members.get(i).getName())) {
						System.out.println("중복된 아이디가 존재합니다.");
						System.out.println("다시 입력해주세요.");
						break;
					}
				}	
			}
			if(idChk == -1) {
				break;
			}
		}

		System.out.print("비밀번호: ");
		password = Main.sc.nextLine();
		System.out.print("이름: ");
		name = Main.sc.nextLine();

		Main.members.add(new Member(id, password, name));
		System.out.println(name+"님 가입을 축하합니다.");
	}

	public static int signIn() {
		String id, password;
		System.out.println("로그인");
		System.out.print("아이디: ");
		id = Main.sc.nextLine();
		System.out.print("비밀번호: ");
		password = Main.sc.nextLine();
		if(Main.members.size()>=1) {
			for(int i=0;i<Main.members.size();i++) {
				if(id.equals(Main.members.get(i).getId()) &&
						password.equals(Main.members.get(i).getPassword())) {
					System.out.println("로그인 성공");
					return i;
				}
			}	
		}else {
			System.out.println("등록된 사용자가 없습니다.");
			return -1;
		}

		System.out.println("등록된 아이디가 아니거나 비밀번호가 틀립니다.");
		return -1;
	}

	public static Board postWrite(int idx) {
		System.out.print("글 제목: ");
		String title = Main.sc.nextLine();
		String writer = Main.members.get(idx).getName();
		String password = Main.members.get(idx).getPassword();

		Board post = new Board(Main.members.get(idx).getId(), title, writer, password);

		return post;
	}
	
	public static void lookMyPost(int idx) {
		boolean run = true;
		while(run) {
			if(Main.posts[0]==null) {
				voidPost();
				run=false;
			}else {
				lookMyPosts(idx);
				System.out.println("게시글을 선택하세요.");
				System.out.print(">");				
				int selectPostNumber = Controller.inputNum();
				if(selectPostNumber==0) {
					return;
				}
				int postIdx=-1;
				for(int i=0;i<Main.posts.length;i++) {
					if(Main.posts[i]==null) {
						break;
					}else if(selectPostNumber==Main.posts[i].getPostNumber()
							&& Main.members.get(idx).getId().equals(Main.posts[i].getId())) {
						postIdx=i;													
					}					

				}
				if(postIdx==-1) {
					System.out.println("잘못 입력했습니다.");
				}else {
					System.out.println("--------------------------------------");
					System.out.println("제목: "+Main.posts[postIdx].getTitle());
					System.out.println("작성자: "+Main.posts[postIdx].getWriter());
					System.out.println("--------------------------------------");
					System.out.print("글 내용: ");
					System.out.println(Main.posts[postIdx].getContent());
					System.out.println();
				}
			}
		}
	}

	public static void lookMyPosts(int idx) {
		System.out.println("0. 메인 메뉴로 돌아가기");				
		for(int i=0;i<Main.posts.length;i++) {
			if(Main.posts[i]!=null && 
					Main.members.get(idx).getId().equals(Main.posts[i].getId())) {
				System.out.println(Main.posts[i].getPostNumber()+". "+Main.posts[i].getTitle());
			}
		}

	}
	
	public static void modifyPost(int idx) {
		if(Main.posts[0]==null) {
			voidPost();
			return;
		}
		System.out.println("수정할 글을 선택하세요.");
		lookMyPosts(idx);
		System.out.print(">");
		int postNum = Controller.inputNum()-1;		
		if(postNum==-1) {
			return;
		}else if(Main.posts[postNum]!=null && 
				Main.members.get(idx).getName().equals(Main.posts[postNum].getWriter())) {
			
			System.out.println(Main.posts[postNum].getTitle()+"을(를) 수정 하시겠습니까? (y/n)");
			System.out.print(">");
			String mdfChk = Main.sc.nextLine();
			
			if(mdfChk.equals("Y")||mdfChk.equals("y")) {
				
				System.out.print("글 제목: ");
				String title = Main.sc.nextLine();
				Main.posts[postNum].setTitle(title);

				System.out.println("글 내용: ");
				Main.posts[postNum].resetContent();
				View.postContent(postNum);				
				
				System.out.println("수정 완료");
			}else if(mdfChk.equals("N")||mdfChk.equals("n")) {
				return;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}else {	
			System.out.println("잘못 입력했습니다.");
		}
	}
	public static void deletePost(int idx) {
		if(Main.posts[0]==null) {
			voidPost();
			return;
		}		
		System.out.println("삭제할 글을 선택하세요.");
		ViewMember.lookMyPosts(idx);
		System.out.print(">");
		int postNum = Controller.inputNum();		
		if(postNum==0) {
			return;
		}else if(Main.posts[postNum-1]==null) {
			System.out.println("잘못 입력했습니다.");
			return;
		}else {
			System.out.println(Main.posts[postNum-1].getTitle()+"을(를) 삭제 하시겠습니까? (y/n)");
			System.out.print(">");
			String delChk = Main.sc.nextLine();
			if(delChk.equals("Y")||delChk.equals("y")) {
				for(int i=postNum-1;i<Main.posts.length;i++) {
					if(Main.posts[i+1]!=null) {
						Main.posts[i+1].setPostNumber(Main.posts[i].getPostNumber());
						Main.posts[i]=Main.posts[i+1];
					}else {
						Main.posts[i]=null;
						break;
					}
				}System.out.println("삭제 완료");
			}else if(delChk.equals("N")||delChk.equals("n")) {
				return;
			}
		}
	}


	private static void voidPost() {
		System.out.println("글목록이 없습니다.");

	}

	public static void deadline() {
		System.out.println("글을 더 작성할수 없습니다.");

	}



	public static void out() {
		System.out.println("로그아웃 하시겠습니까? (y/n)");
		String outChk = Main.sc.nextLine();
		if(outChk.equals("Y")||outChk.equals("y")) {
			System.out.println("로그아웃합니다.");
			
		}else if(outChk.equals("N")||outChk.equals("n")) {
			return;
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
	}

}