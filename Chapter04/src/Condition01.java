import java.util.Scanner;

public class Condition01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요. ");
		int score = input.nextInt();
		
		if(score>=60) {
			//조건이 true일때 실행되는 코드블록(영역)
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		
		System.out.println("프로그램을 종료합니다.");

	}

}
