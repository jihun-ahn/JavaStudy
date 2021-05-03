import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();  		// '공백'이 입력되기 전까지 "문자열"을 입력받는 기능
								 		// 안녕 하세요 => 안녕
		System.out.println(str1);
		
		in.nextLine(); 					//*next()로 인한 데이터 입력 오류 방지*
		
		String str2 = in.nextLine(); 	// '엔터'가 입력되기 전까지 "문자열"을 입력받는 기능
										// 안녕 하세요 => 안녕 하세요
		System.out.println(str2);
		
		in.nextInt();
		in.nextDouble();
		in.nextLine();
	}

}
