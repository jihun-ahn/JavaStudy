package chapter01;

public class ConsoleOutput01 {

	public static void main(String[] args) {
	//콘솔 출력
	System.out.println("안녕하세요");
	System.out.println(20);
	System.out.println(20+7);
	System.out.println("안녕"+"하세요");
	System.out.println("20"+7); // 문자 + 는 문자를 이어붙이는 의미
	
	System.out.print("안녕하세요");
	System.out.print("안녕"+"하세요"); // println과 print는 줄바꿈과 공백일 때 에러 차이가 있다
	System.out.println();
	System.out.printf("제 이름은 %s입니다. \n", "홍길동");
	System.out.printf("제 자바 점수는 %d점입니다. \n", 90);
	}
}