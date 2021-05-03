
public class Repetition01 {

	public static void main(String[] args) {
		//10이라는 숫자를 10번 출력하세요
		int count = 1;
		while(count<=10) {
			System.out.println(10);
			count++;
		}
		System.out.println("----------");
		
		count = 1;
		while(count<=10) {
			System.out.println(count);
			count++;
		}		
		System.out.println("----------");
				
		count = 1;
		do {
			System.out.println(10);
			count++;			
		}while(count==10);
		System.out.println("----------");
		count = 1;
		
		do {
			System.out.println(count);
			count++;			
		}while(count<=10);
		
		int sum = 0;
		count = 1;
		while(count<=10) {
			sum += count;
			count++;
		}
		System.out.println(sum);
	}

}
