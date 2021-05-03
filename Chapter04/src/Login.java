import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//미리 저장된 ID,password
		String id = "green";
		String password = "123456";

		System.out.println("로그인 프로그램");
		System.out.print("아이디 : ");
		String userId = scan.nextLine();
		System.out.print("비밀번호 : ");
		String userPassword = scan.nextLine();

		//System.out.println("입력한 아이디는 :"+userId);
		//System.out.println("입력한 비밀번호는 : "+userPassword);

		// 로그인 처리 프로그램을 만들어 봅시다.
		// 아이디가 틀린 경우 "아이디가 존재하지 않습니다." 메세지 출력
		// 비밀번호가 틀린 경우 "잘못된 비밀번호입니다." 메세지 출력
		// 아이디, 비밀번호가 일치하는 경우 "로그인 성공" 메세지 출력
		if(userId.equals(id)) {
			if(userPassword.equals(password)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("잘못된 비밀번호입니다.");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		//문자열 비교연산은 피연산자.equals(피연산자)로 수행
	
	if((userId.equals(id)) && (userPassword.equals(password))) {
		System.out.println("로그인 성공");
	}else {
		System.out.println("로그인 실패");
	}
	
	
	}

}
