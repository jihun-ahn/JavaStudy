package Question08;

public class ControllerMember {
	
	private int logIdx;
	
	public ControllerMember(int idx) {
		this.logIdx = idx;
		init();
	}

	private void init() {
		boolean run = true;
		while(run) {			
			switch(ViewMember.menu()) {
			case 1:	//게시글 보기
				View.lookPost();
				break;
				
			case 2:	//내 게시글 보기
				ViewMember.lookMyPost(logIdx);
				break;
				
			case 3:	//글 작성
				Board board = ViewMember.postWrite(logIdx);
				int num = -1;
				for(int i=0;i<Main.posts.length;i++) {
					if(Main.posts[i]==null) {
						Main.posts[i]=board;
						num = i;
						break;
					}
				}
				if(num==-1) {
					ViewMember.deadline();
				}else {
					View.postContent(num);
					Main.posts[num].setPostNumber(num+1);
				}
				break;
				
			case 4: //글 수정
				ViewMember.modifyPost(logIdx);
				break;
				
			case 5: //글 삭제
				ViewMember.deletePost(logIdx);
				break;
				
			case 6: //로그아웃
				ViewMember.out();
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 확인해주세요.");
				break;
			}

		}
		
	}

}
