import java.util.Random;
import java.util.Scanner;

public class Question02 {
	
	public static void main(String[] args) {
		
		//1번 문제. 1부터 100까지 합
		
		//for문
//		int sum = 0;
//		for(int i=1;i<=100;i++) { //for(;;)는 무한반복을 의미함
//			sum+=i;
//		}
//		System.out.println("합계 : "+sum);		
//		
//		
//		//while문
//		int i=0;
//		sum=0;
//		while(i<=100) {	
//			sum+=i;
//			i++;
//		}
//		System.out.println("합계 : "+sum);		

		
		
		
		
		// 2, 3번 문제. 1부터 100까지 7의 배수의 합과 평균
//		int count = 0;
//		int num = 0;
//		for(int i=1;i<=100;i++) {
//			if((i%7)==0) {
//			count+=i;
//			num++;
//			}
//		}
//		System.out.println("합 :"+count);
//		System.out.println("평균 : "+((double)(count/num)));
		
		// 4번 문제. 1부터 100까지 합을 구하되 합계1000이되면 중단하고 합계출력
//		int count = 0;
//		int j = 0;
//		for(int i=1;i<=100;i++) {
//			count+=i;
//			if(count>=1000) {
//				j=i;
//				break;
//			}
//		
//		}
//		System.out.println("합계 : "+count);
//		System.out.println(j);	
		
		//X
//		int count = 0;
//		int num = 0;
//		for(int i=1;i<=100;i++) {
//			if(((i%2)==0) || ((i%7)==0)) {
//				System.out.println(i);
//				count+=i;
//				num++;
//			}
//		}
//		System.out.println("합 : "+count);
//		System.out.println("평균 : "+(double)(count/num));
		
		//X
//		for(int i=10;i<=100;i++) {
//			if((((i/10)%2)==0) && ((i%2)==0)) {
//				System.out.println(i);
//			}
//		}
		
		
		//5번 문제
//		Scanner scan = new Scanner(System.in);
//		String id = "grean";
//		String password = "gr1234";
//		
//		System.out.print("아이디를 입력하세요 : ");
//		String userId = scan.nextLine();
//		System.out.print("비밀번호를 입력하세요 : ");
//		String userPassword = scan.nextLine();
//		
//		if(userId.equals(id) && userPassword.equals(password)) {
//			System.out.println("로그인 성공");			
//		}else {
//			System.out.println("아이디 또는 비밀번호가 틀립니다.");
//		}		
		
		//6번 문제
//		Scanner score = new Scanner(System.in);
//		
//		System.out.print("국어 점수를 입력하세요 : ");
//		int kor = score.nextInt();
//		System.out.print("영어 점수를 입력하세요 : ");
//		int eng = score.nextInt();
//		System.out.print("수학 점수를 입력하세요 : ");
//		int math = score.nextInt();
//		
//		int sum = kor+eng+math;
//		double avg = sum/3;
//		System.out.printf("총점 : %d, 평균 : %.1f \n", sum, avg);
		
		//X
//		Scanner scan = new Scanner(System.in);
//	
//		System.out.println("4~100사이의 숫자를 입력하세요");
//		int num = scan.nextInt();
//		
//		if((num>=4) && (num<=100)) {
//			for(int i=1;i<=100;i++) {
//				if((num%i)==0) {
//					System.out.println(i);
//				}
//			}
//		}else {
//			System.out.println("error");
//		}
		
		//7번 문제
//		for(int j=2;j<=9;j++) {
//			for(int i=1;i<=9;i++) {
//				if((j%2)==0) {
//					System.out.printf("%d X %d = %d \n", j, i, i*j);
//				}
//			}
//			if((j%2)==0) {
//				System.out.println("----------");
//			}
//		}
		
		//8번 문제
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("두개의 수를 입력하세요.");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = num1;
//		int num4 = num2;
//		int sum = 0;
//		while(num3!=num4) {
//			if(((num3-num4)==1) || ((num4-num3)==1)) {
//				break;
//			}
//			if(num3>num4) {
//				num4++;
//				sum+=num4;
//			}else {
//				num3++;
//				sum+=num3;
//			}
//		}
//		System.out.println("두개의 수와 두 수 사이의 합 : "+(num1+num2+sum));
		
		//9번 문제
//		char star = '☆';
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(star);
//			}
//		System.out.println();
//		}
//		
		
		//10번 문제
//		Scanner rps = new Scanner(System.in);
//		Random cpu = new Random();
//		System.out.println("가위 바위 보 중 하나를 입력하세요");
//		System.out.print("나 : ");
//		String userRps = rps.nextLine();
//		int cpuRpsInt = cpu.nextInt(3);
//		int userRpsInt;
//		String cpuRpsStr;
//
//		if(userRps.equals("가위")) {	// 0가위 / 1바위 / 2보
//			userRpsInt = 0;
//		}else if(userRps.equals("바위")) {
//			userRpsInt = 1;
//		}else if(userRps.equals("보")){
//			userRpsInt = 2;
//		}else {
//			userRpsInt = 3;
//		}
//		switch(cpuRpsInt) {
//		case 0:
//			cpuRpsStr = "가위";
//			break;
//		case 1:
//			cpuRpsStr = "바위";
//			break;
//		case 2:
//			cpuRpsStr = "보";
//			break;
//		default:
//			cpuRpsStr = "오류";
//		}
//		int result = (userRpsInt-cpuRpsInt);
//		String resultStr;
//		if(userRpsInt==3) {
//			System.out.println("오류");
//		}else {
//			switch(result) {
//			case -2: case 1:
//				resultStr = "승";
//				break;
//			case -1: case 2:
//				resultStr = "패";
//				break;		
//			case 0:
//				resultStr = "무";
//				break;
//			default :
//				resultStr = "오류";
//			}
//			System.out.println("컴퓨터 : "+cpuRpsStr);
//			System.out.println(resultStr);
//		}		
	}

}
