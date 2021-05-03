package Question08;

import java.util.Scanner;

public class menu {
	static Board[] posts;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		posts = new Board[1];
		while(run) {
			System.out.println("게시판 메인 메뉴");
			System.out.println("1. 게시글 보기");
			System.out.println("2. 글 작성");
			System.out.println("3. 글 삭제");
			System.out.print(">");
			int selectNum = Integer.parseInt(sc.nextLine());
			switch(selectNum) {
			case 1:
				lookPost();
				break;
			case 2:
				posting();
				break;
			case 3:
				deletePost();
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}

		}		

	}
	public static void lookPost() {
		boolean run = true;
		while(run) {
			System.out.println("글 목록");
			for(int i=0;i<posts.length;i++) {
				if(posts[i]!=null) {
					System.out.println((i+1)+". "+posts[i].getTitle());
				}else {
					break;
				}
			}
			System.out.println("게시글을 선택하세요.");
			System.out.print(">");
			int selectPostNumber = Integer.parseInt(sc.nextLine());
			int postIdx=-1;
			for(int i=0;i<posts.length;i++) {
				if(posts[i]==null) {
					break;
				}else {
					if(selectPostNumber==posts[i].getPostNumber()) {
						postIdx=i;
						System.out.println(postIdx);
						if(postIdx==-1) {
							System.out.println("잘못 입력했습니다.");
						}else {
							System.out.println(posts[postIdx].getContent());
						}
					}
				}

			}
		}
	}


	public static void posting() {
		int postIdx=-1;
		System.out.print("글 제목: ");
		String title = sc.nextLine();
		System.out.print("작성자: ");
		String writer = sc.nextLine();
		System.out.print("비밀번호: ");
		String password = sc.nextLine();

		Board post = new Board(title, writer, password);
		for(int i=0;i<posts.length;i++) {
			if(posts[i]==null) {
				posts = new Board[i+2];
				posts[i]=post;
				postIdx=i;
				break;
				
			}
		}
		System.out.println("글 내용을 작성해주세요. 작성이 끝나면 \"종료\"입력");
		boolean run = true;
		while(run) {
			String content = sc.nextLine();
			if(content.equals("종료")) {
				run = false;
				posts[postIdx].setPostNumber(postIdx);
				System.out.println(posts[postIdx].getContent());
			}else {
				posts[postIdx].setContent(content);
			}
			
		}

	}
	
	
	private static void deletePost() {
				
	}
}
