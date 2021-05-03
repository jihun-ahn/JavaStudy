package Question08;

public class View {

	public static int mainMenu() {
		System.out.println("게시판 메인 메뉴");
		System.out.println("1. 게시글 보기");
		System.out.println("2. 회원 가입");
		System.out.println("3. 로그인");
		System.out.println("4. 프로그램 종료");
		System.out.print(">");
		

		return Controller.inputNum();
	}

	public static void lookPost() {
		boolean run = true;
		while(run) {
			if(Main.posts[0]==null) {
				View.voidPost();
				run=false;
			}else {
				lookPosts();
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
					}else if(selectPostNumber==Main.posts[i].getPostNumber()) {
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
				}
			}
		}
	}

	private static void lookPosts() {
		System.out.println("0. 메인 메뉴로 돌아가기");				
		for(int i=0;i<Main.posts.length;i++) {
			if(Main.posts[i]!=null) {
				System.out.println((i+1)+". "+Main.posts[i].getTitle());
			}
		}

	}

	private static void voidPost() {
		System.out.println("글목록이 없습니다.");

	}
	
	public static void postContent(int num) {
		System.out.println("글 내용을 작성해주세요. 작성이 끝나면 \"종료\"입력");
		boolean run = true;
		while(run) {
			String content = Main.sc.nextLine();
			if(content.equals("종료")) {
				run=false;
				System.out.println("글 작성이 완료 되었습니다.");
			}else {
				Main.posts[num].setContent(content);
			}
		}
	}

	public static void programExit() {
		String exitChk = Main.sc.nextLine();
		if(exitChk.equals("Y")||exitChk.equals("y")) {
			System.out.println("프로그램 종료");
			System.exit(0);			
		}else if(exitChk.equals("N")||exitChk.equals("n")) {
			
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
	}

}
