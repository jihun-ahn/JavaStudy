import java.util.Scanner;

public class PptQuestion09 {
	static String[] names = new String[] {"고길동","김길동","이길동","박길동","홍길동"};
	static int[][] scores = new int[5][4];
									//국어 78,85,74,74,68
									//영어 64,71,69,77,95
									//수학 82,64,57,95,84
									//총점  X, X, X, X, X
	static double[] avg =new double[5];
	static int[] ranking = new int[] {1,1,1,1,1};
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] arg) {
		boolean run = true;
		while(run) {
			int selectNum = mainMenu();
			switch(selectNum) {
			case 1:
				input();
				break;
			case 2:
				check();
				break;
			case 3:
				checkRanking();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("1~4번 중에 선택해주세요.");
			}
		}
	}
	private static void subjectSelect() {
		System.out.println("조회 하려는 과목을 입력하세요.");
		System.out.println("1. 국어");					//국어 점수의 배열 번호 0번
		System.out.println("2. 영어");					//영어 점수의 배열 번호 1번
		System.out.println("3. 수학");					//수학 점수의 배열 번호 2번
		System.out.print(">");
		int subjectNum = Integer.parseInt(sc.nextLine());
		
		
		switch(subjectNum){
			case 1:
			case 2:
			case 3:
				checkSubject(subjectNum);
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
		}	
	}
								//선택한 과목 번호가 곧 인덱스 번호
	private static void checkSubject(int subjectNum) {
		
		int total=0;//과목의 합계점수
		
		for(int i=0;i<scores.length;i++) {
			total+=scores[i][subjectNum-1];
		}
		double avg = total/(double)scores.length;	//과목의 평균 점수
		if(subjectNum==1) {
			System.out.println("전체 국어 총점: "+total);
			System.out.println("전체 국어 평균: "+avg);
		}else if(subjectNum==2) {
			System.out.println("전체 영어 총점: "+total);
			System.out.println("전체 영어 평균: "+avg);
		}else if(subjectNum==3) {
			System.out.println("전체 수학 총점: "+total);
			System.out.println("전체 수학 평균: "+avg);
		}
				
		
		
		//입력받은 과목 번호로 과목당 총점과 평균
		
		
	}
	private static void checkRanking() {
		for(int i=0;i<ranking.length;i++) {					
			System.out.println(names[i]+"학생의 석차: "+ranking[i]);
		}
		
	}

	private static void check() {
		menu:while(true) {
			System.out.println("----성적 조회----");
			System.out.println("1. 개인별 성적 조회");
			System.out.println("2. 과목별 성적 조회");
			System.out.println("3. 메뉴");
			System.out.print(">");

			int selectNum = Integer.parseInt(sc.nextLine());

			switch(selectNum) {
			case 1://개인별 성적 조회 => 학생 이름을 조회하는 메서드
				//조회된 정보를 통해서 성적을 출력하는 메서드
				int studentIdx = studentSelect();
				if(studentIdx == -1) {
					System.out.println("학생 이름을 조회 할 수 없습니다.");
				}else {
					checkStudentScore(studentIdx);
				}
				break;
			case 2:
				subjectSelect();
				break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println();
			}

		}
	}

	private static void checkStudentScore(int studentIdx) {
		System.out.println("학생 이름 : "+names[studentIdx]);
		System.out.println("국어 점수 : "+scores[studentIdx][0]);
		System.out.println("영어 점수 : "+scores[studentIdx][1]);
		System.out.println("수학 점수 : "+scores[studentIdx][2]);
		System.out.println(" 총  점  : "+scores[studentIdx][3]);
		System.out.println(" 평  균  : "+avg[studentIdx]);
		System.out.println(" 석  차  : "+ranking[studentIdx]);		
	}

	private static int studentSelect() {
		int idx = -1;
		System.out.println("조회할 이름을 입력하세요.");
		System.out.print(">");
		String name = sc.nextLine();
		for(int i=0;i<names.length;i++) {
			if(name.equals(names[i])) {
				idx=i;
				break;
			}
			
		}
		return idx;
	}

	private static void input() {
		System.out.println("성적 정보를 입력하세요.");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"학생");
			System.out.print("국어 점수>");
			scores[i][0]=Integer.parseInt(sc.nextLine());
			System.out.print("영어 점수>");
			scores[i][1]=Integer.parseInt(sc.nextLine());
			System.out.print("수학 점수>");
			scores[i][2]=Integer.parseInt(sc.nextLine());
			//학생의 총점
			scores[i][3]=scores[i][0]+scores[i][1]+scores[i][2];
			//학생의 평균
			avg[i]=scores[i][3]/3.0;
			//석차
			for(int j=0;j<i;j++) {
				if(avg[i]<avg[j]) {
					ranking[i]++;
				}else{
					ranking[j]++;
				}
			}
		}
	}

	private static int mainMenu() {
		System.out.println("성적 관리 프로그램");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 조회");
		System.out.println("3. 석차 조회");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택>");
		int selectNum=Integer.parseInt(sc.nextLine());
		return selectNum;
	}
	
	
	
	
	
}