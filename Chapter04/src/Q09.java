import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		
//		for(int i=1;i<=5;i++) {	//행 줄바꿈
//			for(int j=1;j<=i;j++) {	//열 별찍기
//				System.out.print('☆');
//			}
//		System.out.println();
//		}
		//라인수를 입력받아서 별을 찍어봅시다.
		Scanner sc = new Scanner(System.in);
		System.out.println("라인 수를 입력하세요. ");
		int line = Integer.parseInt(sc.nextLine());
		
		for(int j=1;j<=line;j++) {	//행 줄바꿈
			for(int i=1;i<=j;i++) {	//열 별찍기
				System.out.print('☆');
			}
		System.out.println();
		}
		
	}

}
