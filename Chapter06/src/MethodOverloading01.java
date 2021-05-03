
public class MethodOverloading01 {

	public static void main(String[] args) {
		info("안지훈");
		info("안지훈",26);
		info("ahn","1234");
		info(150,"이것이 자바다");

	}
	
	
	public static void info(String name) {					//모두 이름은 같지만 매개값 갯수, 타입, 순서에 따라 
		System.out.println("이름: "+name);					//다른 메소드로 구분가능
	}
	
	public static void info(String name, int age) {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
	
	public static void info(String id, String password) {
		System.out.println("아이디: "+id);
		System.out.println("비밀번호: "+password);
	}
	
	public static void info(int page, String title) {
		System.out.println("책 제목: "+title);
		System.out.println("페이지: "+page);
	}
	
//	public static void info(String title, String chapter) {	//변수명이 다른 것은 구분하지않음
//		System.out.println("책 제목: "+title);
//		System.out.println("페이지: "+chapter);
//	}
	
}
