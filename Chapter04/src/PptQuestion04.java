import java.util.Random;
import java.util.Scanner;

public class PptQuestion04 {

	public static void main(String[] args) {
		//12번 문제
//		int count=0;
//		for(int i=1;i<=20;i++) {
//			if((i%2==0) || (i%3==0)) {
//				
//			}else {
//				System.out.println(i);
//				count+=i;
//			}
//		}

		//13번 문제
//		int count=0;
//		int cnt=0;
//		for(int i=1;i<=10;i++) {
//			count+=cnt+i;	
//			cnt+=i;
//			System.out.println(count);
//		}
		
		//14번 문제
//		int sum=0;
//		int count=0;
//		int i=0;
//		int j=0;
//		while(sum<100) {
//			i++;
//			if((i%2)==0) {
//			j=i*(-1);
//			}else {
//				j=i;
//			}
//			sum+=j;
//			count++;
//			System.out.println(sum);
//		}
//		System.out.println(count);
		//15번 문제*모름
//		int num = 123456;
//		int a=num;
//		int b=0;
//		while(a!=0) {
//			b = a%10+b;
//			a = a/10;
//		}
//		System.out.println(b);
		
		
		
		//16번 문제
//		int count=0;
//		int a=1;
//		int b=1;
//		for(int i=1;i<=5;i++) {
//			System.out.printf("%d %d ", a, b);
//			count+=a+b;
//			if(i==5) {
//				break;
//			}
//			a+=b;
//			b+=a;
//		}
//		System.out.println();
//		System.out.println("10번째 수 :"+b);
//		System.out.println("총 합 : "+count);

		
		//17번 문제 *모름
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int a=num;
//		int b=0;
//		while(a!=0) {
//			b=(b*10)+(a%10);
//			a=a/10;
//		}
//			
//			if(b==num) {
//				System.out.println("회문수");
//			}else {
//				System.out.println("회문수 아님");
//			}
		
		//18번 문제
//		Scanner sc = new Scanner(System.in);
//		Random rnd = new Random();
//		int num = rnd.nextInt(100)+1;
//		System.out.println(num);
//		int userNum = sc.nextInt();
//		
//		while(num!=userNum) {
//			if(num>userNum) {
//				System.out.print("더 큽니다.");
//				userNum = sc.nextInt();	
//			}else {
//				System.out.print("더 작습니다.");
//				userNum = sc.nextInt();
//			}
//			
//		}
//		System.out.printf("정답 (%d)", num);
		
		//19번 문제
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("☆");
//			}
//		System.out.println();
//		}
		
		//20번 문제
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print("☆");
//			}
//		System.out.println();
//		}
		
		//21번 문제
//		int n = 5;
//		for(int i=1;i<=n;i++) {
//			if(i<=(n/2+1)) {
//				for(int j=1;j<=i;j++) {
//					System.out.print("☆");
//				}
//			}else {
//				for(int j=n;j>=i;j--) {
//					System.out.print("☆");
//				}
//			}
//			System.out.println();
//		}
//	
		//22번 문제
//		int n = 5;
//		for(int i=1;i<=n;i++) {
//			if(i<=(n/2+1)) {
//				for(int j=1;j<=i;j++) {
//					System.out.print("☆");
//				}
//			}else {
//				for(int j=n;j>=i;j--) {
//					System.out.print("☆");
//				}
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int n=6;
		for(int i=1;i<=n;i++) {
			if((n/2)==i) break;
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n/2+(n%2+1);i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}