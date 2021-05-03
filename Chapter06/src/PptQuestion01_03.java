import java.util.Scanner;

public class PptQuestion01_03 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		gugudan();				//1번 
//		inputGugudan();			//2번
//		twoInputGugudan();		//3번
//		System.out.println("한개 또는 두개의 숫자를 입력하세요.");
//		System.out.print("첫번째 숫자: ");
//		int num1 = Integer.parseInt(sc.nextLine());
//		String num2 = sc.nextLine();
		
		
		
		
		}
	
	
	public static void twoInputGugudan() {
		System.out.println("두개의 수를 입력하세요.");
		int num1=Integer.parseInt(sc.nextLine());
		int num2=Integer.parseInt(sc.nextLine());
		
		if(num1>num2) {
			System.out.println(num2+"단 부터 "+num1+"단 까지");
			
			for(int j=num2;j<=num1;j++) {
				System.out.printf("*** %d단 ***\n", num1);
				for(int i=1;i<10;i++) {
					System.out.printf("%d X %d = %d\n", j, i, j*i);
				}
				System.out.println("------------------------");
			}
		}else if(num1<num2) {
			System.out.println(num1+"단 부터 "+num2+"단 까지");
			for(int j=num1;j<=num2;j++) {
				for(int i=1;i<10;i++) {
					System.out.printf("%d X %d = %d\n", j, i, j*i);
				}
				System.out.println("------------------------");
			}
		}else {
			System.out.println(num1+"단");
			for(int i=1;i<10;i++) {
				System.out.printf("%d X %d = %d\n", num1, i, num1*i);
			}
		}
		
	}
	
	
	public static void gugudan() {						//1번
		for(int j=2;j<=9;j++) {
			System.out.printf("*** %d단 ***\n", j);

			for(int i=1;i<=9;i++) {
				System.out.printf("%d X %d = %d\n", j, i, i*j);
			}
		}

	}
	

	public static void inputGugudan() {					//2번
		System.out.println("단수를 입력하세요.");
		System.out.print(">");
		int num = Integer.parseInt(sc.nextLine());
		System.out.printf("*** %d단 ***\n", num);
		for(int i=1;i<10;i++) {
			System.out.printf("%d X %d = %d\n", num, i, num*i);
		}
	}
}


