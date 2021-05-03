
public class Method01 {

	public static void main(String[] args) {
		//함수를 실행 시키는 방법 => 함수의 이름을 실행(호출)
		hello();
		String n = "조다";
		introduce(n);
		
		int num = dice();
		System.out.println(num);
//		int a=3;
//		int b=5;
//		int result = add(a,b);
//		System.out.println("합계 : "+result);
	}
	public static void hello() {//함수
		//함수가 작동되기 위한 기능 모음
		System.out.println("안녕하세요!!");
		
	}
	public static void introduce(String name) {
		System.out.println(name+"님 환영합니다.");
		
	}
	public static int dice() {
		int dice = (int)(Math.random()*6)+1;
		
		return dice;
		
	}		
	private static int add(int a, int b) {
		int c = a+b;
		return c;
	}
}
