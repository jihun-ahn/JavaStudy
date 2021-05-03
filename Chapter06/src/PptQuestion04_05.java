import java.util.Scanner;

public class PptQuestion04_05 {

	public static void main(String[] args) {
		
		//4번 문제
		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단 단수 입력");
//		System.out.print(">");
//		int num1 = Integer.parseInt(sc.nextLine());
//		gugudan(num1);
//		
//		
//		System.out.println("구구단 단수 두번 입력");
//		System.out.println("첫번째 단수 입력");
//		System.out.print(">");
//		int num2 = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 단수 입력");
//		System.out.print(">");
//		int num3 = Integer.parseInt(sc.nextLine());
//		gugudan(num2, num3);		
		
		//5번문제
		int[] nums = {78, 54, 89, 57, 84, 95, 74, 91, 84, 67, 52, 94, 82};
//		int[] nums = null;
		int maxNum = max(nums);
		System.out.println(maxNum);
		
		
		
	}
	
	//4번 메서드
	public static void gugudan(int num1) {
		System.out.println("*** "+num1+ "단 ***");
		for(int i=1;i<=9;i++) {
				System.out.printf("%d X %d = %d\n", num1, i, i*num1);
			}
	}
	
	
	public static void gugudan(int num1, int num2) { //비슷한 기능의 메서드를
													 //다른 메서드에서 실행 고려하기
		if(num1>num2) {
			System.out.println(num2+"단 부터 "+num1+"단 까지");

			for(int i=num2;i<=num1;i++) {
				gugudan(i);
				System.out.println();
			}
		}else if(num1<num2) {
			System.out.println(num1+"단 부터 "+num2+"단 까지");
			for(int i=num1;i<=num2;i++) {
				gugudan(i);
				System.out.println();
			}
		}else {
			System.out.println(num1+"단");
			for(int i=1;i<10;i++) {
				gugudan(i);
			}
			
//			for(int i=num2;i<=num1;i++) {	
//				System.out.printf("*** %d단 ***\n", j);
//				for(int i=1;i<10;i++) {
//					System.out.printf("%d X %d = %d\n", j, i, j*i);
//				}
//			}
		}

	}	

	
	//5번 메서드	
	public static int max(int[] nums) {
		int max = 0;
		if((nums == null)||(nums.length==0)) {
			max=-99999;
		}else {
			for(int i=0;i<nums.length;i++) {
				if(max<nums[i]) {
					max = nums[i];
				}

			}		
		}


		return max;

	}

}
