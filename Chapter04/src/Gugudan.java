
public class Gugudan {

	public static void main(String[] args) {
		//1단계 : 구구단 2단을 출력해봅시다.
		System.out.println("2 X 1 = 2");
		System.out.println("2 X 2 = 4");
		System.out.println("2 X 3 = 6");
		System.out.println("2 X 4 = 8");
		System.out.println("2 X 5 = 10");
		System.out.println("2 X 6 = 12");
		System.out.println("2 X 7 = 14");
		System.out.println("2 X 8 = 16");
		System.out.println("2 X 9 = 18");
		
		System.out.println("----------");
		
		//2단계 : 변화하지 않는 부분, 변화하는 부분을 구분해 만들어 봅시다.
		System.out.printf("2 X %d = %d \n", 1, (2*1));
		System.out.printf("2 X %d = %d \n", 2, (2*2));
		System.out.printf("2 X %d = %d \n", 3, (2*3));
		System.out.printf("2 X %d = %d \n", 4, (2*4));
		System.out.printf("2 X %d = %d \n", 5, (2*5));
		System.out.printf("2 X %d = %d \n", 6, (2*6));
		System.out.printf("2 X %d = %d \n", 7, (2*7));
		System.out.printf("2 X %d = %d \n", 8, (2*8));
		System.out.printf("2 X %d = %d \n", 9, (2*9));
		
		System.out.println("----------");
		
		//3단계 : 2단계의 내용을 반복문을 이용해서 출력해 봅시다.
		for(int i=1;i<=9;i++) {
			System.out.printf("2 X %d = %d\n", i, i*2);
			}
		
		System.out.println("----------");
		//4단계 : 3단계의 내용을 9단까지 반복해봅시다.
		System.out.println("*** 2단 ***");
		for(int i=1;i<=9;i++) {
			System.out.printf("2 X %d = %d\n", i, i*2);
			}
		System.out.println("*** 3단 ***");
		for(int i=1;i<=9;i++) {
			System.out.printf("3 X %d = %d\n", i, i*3);
			}
		System.out.println("*** 4단 ***");
		for(int i=1;i<=9;i++) {
			System.out.printf("4 X %d = %d\n", i, i*4);
			}
		System.out.println("*** 5단 ***");
		for(int i=1;i<=9;i++) {
			System.out.printf("5 X %d = %d\n", i, i*5);
			}
		System.out.println("*** 6단 ***");
		for(int i=1;i<=9;i++) {
			System.out.printf("6 X %d = %d\n", i, i*6);
			}
		System.out.println("*** 7단 ***");
		for(int i=1;i<=9;i++) {
			System.out.printf("7 X %d = %d\n", i, i*7);
			}
		System.out.println("*** 8단 ***");
		for(int i=1;i<=9;i++) {
			System.out.printf("8 X %d = %d\n", i, i*8);
			}
		System.out.println("*** 9단 ***");
		for(int i=1;i<=9;i++) {
			System.out.printf("9 X %d = %d\n", i, i*9);
		}
		System.out.println();
		
		System.out.println("----------");
		
		//5단계 4단계의 내용을 반복되는 부분과 반복되지 않는 부분으로 
		//구분해서 반복문을 사용해서 만들어봅시다.
		for(int j=2;j<=9;j++) {
			System.out.printf("*** %d단 ***\n", j);
			
			for(int i=1;i<=9;i++) {
			System.out.printf("%d X %d = %d\n", j, i, i*j);
			}
		System.out.println();
		}
				
	}

}
