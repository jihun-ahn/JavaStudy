package dto;

public class Test {
	//필드
	public String field1 = "public";
	String field2 = "default";
	private String field3 = "private";
	
	// 메서드
	public void method1() {
		System.out.println("public");
	}
	
	void method2() {
		System.out.println("default");
	}

	private void method3() {
		System.out.println("private");
	}
	
	void check() {//public이나 default나 private 제어자 모두 클래스(인스턴스) 내부에서 사용가능
		System.out.println("public : "+this.field1);
		System.out.println("default : "+this.field2);
		System.out.println("private : "+this.field3);
		
		this.method1();
		this.method2();
		this.method3();
	}
}






