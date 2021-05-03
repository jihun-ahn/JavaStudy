import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		//6번 문제
		Scanner score = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		//int kor = score.nextInt();
		int kor = Integer.parseInt(score.nextLine());
		
		System.out.print("영어 점수를 입력하세요 : ");
		//int eng = score.nextInt();
		int eng = Integer.parseInt(score.nextLine());
		
		System.out.print("수학 점수를 입력하세요 : ");
		//int math = score.nextInt();
		int math = Integer.parseInt(score.nextLine());
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.printf("총점 : %d, 평균 : %.2f \n", sum, avg);

	}

}
