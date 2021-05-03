import java.util.Scanner;

public class ArrayQuestion01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int sumScore=0;
//		double avgScore=0.0;
		boolean run = true;
		int[] jumsu = null;
//		System.out.println("학생수를 입력하세요.");
//		int students = Integer.parseInt(sc.nextLine());
//		int[] studentsNum = new int[students];
//		System.out.println("점수를 입력하세요.");
//		for(int i=0;i<studentsNum.length;i++) {
//			
//			studentsNum[i] = Integer.parseInt(sc.nextLine());
//			
//			sumScore+=studentsNum[i];
//		}
//		avgScore = sumScore/studentsNum.length;
//		System.out.println("총점 : "+sumScore+" 평균 : "+avgScore);
		while(run) {
			System.out.printf("성적 프로그램 \n1. 학생 수 입력 \n2. 점수 입력 "
										+"\n3. 성적 조회 \n4. 프로그램 종료 \n>");
			int selectNum = Integer.parseInt(sc.nextLine());
			
			switch(selectNum) {
			case 1://학생수
				System.out.println("학생 수를 입력하세요.");
				int studentNum = Integer.parseInt(sc.nextLine());
				jumsu = new int[studentNum];
				break;
			case 2://점수입력
				if(jumsu==null) {
					System.out.println("학생 수를 먼저 입력하세요.");
				}else {
					System.out.println("점수를 입력하세요.");
					for(int i=0;i<jumsu.length;i++) {
						System.out.println((i+1)+"번째 학생 점수: ");
						jumsu[i]=Integer.parseInt(sc.nextLine());
					}
				}
				break;
			case 3://성적 조회
				if(jumsu==null) {
					System.out.println("학생 수를 먼저 입력하세요.");
				}else {
					int sum=0;
					double avg =0.0;
					for(int i=0;i<jumsu.length;i++) {
						sum+=jumsu[i];
					}
					avg = sum/(double)jumsu.length;
					System.out.println("총점 : "+sum);
					System.out.println("평균 : "+avg);
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다. \n다시 확인해주세요.");
			}
			
			
		}
	}

}
