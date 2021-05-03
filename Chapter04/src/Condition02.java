import java.util.Scanner;

public class Condition02 {

	public static void main(String[] args) {
		/* 점수가 90점 이상이면 등급 A출력
		 * 점수가 80점 이상이면 등급 B출력
		 * 점수가 70점 이상이면 등급 C출력
		 * 점수가 60점 이상이면 등급 D출력
		 * 점수가 60점 미만이면 등급 F출력
		 */
		Scanner input = new Scanner(System.in);
		//System.out.print("당신의 점수를 입력하세요. ");
//		int score = input.nextInt();
//		input.nextLine();
		
//		if(score>=90) {
//			System.out.println("A");
//		}else {
//			if(score>=80) {
//			System.out.println("B");
//			}else {
//				if(score>=70) {
//					System.out.println("C");
//				}else {
//					if(score>=60) {
//						System.out.println("D");
//					}else {
//						System.out.println("F");
//					}
//				}
//			}
//		}
//		System.out.println("프로그램을 종료합니다");
		
//		String grade ="";
//		
//		if(score>=90) {
//			grade = "A 등급";
//		}else if(score>=80) {
//			grade = "B 등급";
//		}else if(score>=70) {
//			grade = "C 등급";
//		}else if(score>=60) {
//			grade = "D 등급";
//		}else {
//			grade = "F 등급";
//		}
//		System.out.println("당신의 등급은 "+grade+"입니다.");
		
		System.out.println("오늘 선택할 점심 메뉴 ");
		System.out.println("1. 돈가스");
		System.out.println("2. 쫄면");
		System.out.println("3. 햄버거");
		System.out.println("4. 우동");
		System.out.println("5. 컵라면");
		System.out.print(">");
		
		String selectNum = input.nextLine();
		switch(selectNum) {
		case "1":
			System.out.println("돈가스");
			break;
		case "2":
			System.out.println("쫄면");
			break;
		case "3":
			System.out.println("햄버거");
			break;
		case "4":
			System.out.println("우동");
			break;
		case "5":
			System.out.println("컵라면");
			break;
		default:
			System.out.println("목록에 없는 메뉴입니다.");
			
			
		}
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
		
	}
}