import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
				
		
		Scanner scan = new Scanner(System.in);
		int jumsu = scan.nextInt();
							//입력하면 키코드가 2개
		scan.nextLine();    //남은 키코드 제거를 위한 방법 1
		
		String str = scan.nextLine();
		
		//문자열로 입력받아서 숫자로 변환
		String str1 = scan.nextLine();
		int str2 = Integer.parseInt(str1);  // "98" => 98
		//숫자로 생긴 문자열을 정수로 변환해주는 코드
		//Integer.parseInt(문자열)
		//숫자로생긴 문자열을 실수로변환해주는 코드
		//Double.parseDouble(문자열)
	
		int num = Integer.parseInt(scan.nextLine()); 
					//남은 키코드 제거를 위한 방법 2

	}

}
