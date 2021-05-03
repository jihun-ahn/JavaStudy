package ex03;

public class Main01 {

	public static void main(String[] args) {
		String doc = "맛있는 녀석들";

		// 삼성프린터
//		SamsungPrint sp = new SamsungPrint();
		Printable sp = new SamsungPrint();
		sp.print(doc);
		
		System.out.println("------------------");
		//LG 프린터
//		LgPrint lp = new LgPrint();
		Printable lp = new LgPrint();
		lp.print(doc);
		
		System.out.println("------------------");
//		Printable pp = new Printable();// 클래스가 아니므로 인스턴스 생성 불가능
		
		System.out.println("------------------");
//		XXXX    aa = new AA();   // AA 클래스
//		XXXX의 가능성
//		    1. AA 클래스
//		    2. AA 상속하는 부모클래스
//		    3. AA 상속하는 추상클래스(부모)
//		    4. AA를 구현하는 인터페이스
		
		
		
		
		
		
		
		
	}

}
