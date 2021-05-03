package ex01;

public class Main01 {

	public static void main(String[] args) {
		Child01 child = new Child01();
		
		child.name = "홍길동";
		System.out.println("이름 : "+child.name);
		child.method();

//		child.property = "금괴";
//		child.method2();
	}

}
