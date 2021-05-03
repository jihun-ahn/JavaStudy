
public class StaticAndinstance {
	//인스턴스 멤버와 클래스 멤버간의 사용 가능성
	
	//정적 멤버
	static int field1;
	static void method1() {
		System.out.println("클래스 메서드");
	}

	
	//인스턴스 멤버
	int field2;
	void method2() {
		System.out.println("인스턴스 메서드");
		
	}
	
	static void method3() {
		field1 = 10;
//		field2 = 10;
		method1();
//		method2();	
	}
	
	void method4() {
		field1 = 10;
		field2 = 10;
		method1();
		method2();
	}
}
