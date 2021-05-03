package main;

public class Main02 {

	public static void main(String[] args) {
		dto.Test test = new dto.Test();
		
		System.out.println("public : "+test.field1);
//		System.out.println("default : "+test.field2);
//		System.out.println("private : "+test.field3);
		
		test.method1();
//		test.method2();
//		test.method3();

		// dto.Test클래스는 Main02하고 패키지가 다르다.
		// public  사용에 제한이 없다.
		// default  패키지가 다르므로 사용불가 
		// private 클래스 내부가 아니면 사용불가
		
		//////////////////////////////////////////////////////
		Test mainTest = new Test();
		
		System.out.println("public : "+mainTest.field1);
		System.out.println("default : "+mainTest.field2);
//		System.out.println("private : "+mainTest.field3);
		
		mainTest.method1();
		mainTest.method2();
//		mainTest.method3();
		
		// Test클래스는 Main02하고 패키지가 같다.
		// public  사용에 제한이 없다.
		// default  패키지가 같으므로 사용가능 
		// private 클래스 내부가 아니면 사용불가

	}

}
