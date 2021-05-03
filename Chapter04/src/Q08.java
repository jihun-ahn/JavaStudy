import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		//8번 문제
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두개의 수를 입력하세요.");
		//int num1 = scan.nextInt();
		int num1 = Integer.parseInt(scan.nextLine());
		//int num2 = scan.nextInt();
		int num2 = Integer.parseInt(scan.nextLine());

		int num3 = num1;
		int num4 = num2;
		int sum = 0;
		//내가푼것
		while(num3!=num4) {
			if(((num3-num4)==1) || ((num4-num3)==1)) {
				break;
			}
			if(num3>num4) {
				num4++;
				sum+=num4;
			}else {
				num3++;
				sum+=num3;
			}
		}
		System.out.println("두개의 수와 두 수 사이의 합 : "+(num1+num2+sum));

		//첫번째 숫자가 더 클때만 가능
//		sum=0;
//		for(int i=num1;i<=num2;i++) {
//			sum+=i;
//		}
//		
//		System.out.println("합계: "+sum);
		
		//풀이
//		sum=0;
//		if(num1>num2) {
//			for(int i=num2;i<=num1;i++) {
//				sum+=i;
//			}
//		}else {
//			for(int i=num1;i<=num2;i++) {
//				sum+=i;
//			}
//		}	
//	System.out.println("합계: "+sum);
	}

}
