package main;

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
}
