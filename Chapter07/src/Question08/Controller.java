package Question08;

public class Controller {
	
	public Controller() {		
		
	}

	public void init() {
		boolean run = true;
		while(run) {			
			switch(View.mainMenu()) {
			case 1:	//게시글 보기
				View.lookPost();
				break;
			case 2:	//회원 가입
				ViewMember.signUp();
				break;
			case 3:	//로그인
				int log = ViewMember.signIn();

				if(log!=-1) {
					new ControllerMember(log);
				}				
				break;				
			case 4:
				View.programExit();
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 확인해주세요.");
				break;
			}

		}

	}


	public static int inputNum() {
		while(true) {
			try {
				int selectNum = Integer.parseInt(Main.sc.nextLine());
				return selectNum;
			}catch(NumberFormatException err) {
				return 0;
			}
		}
	}
}
