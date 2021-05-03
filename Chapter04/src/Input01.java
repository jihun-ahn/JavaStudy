import java.io.IOException;

public class Input01 {

	public static void main(String[] args) throws Exception {
		//키보드 입력
//		System.in.read(); //키보드 버튼 '하나'를 입력받는 기능
						  //버튼의 키코드(숫자)를 입력받는 기능
		int keyCode = System.in.read();
		
		System.out.println(keyCode);
		System.out.write(keyCode);
		System.out.flush();
	}

}
