package chapter03;

public class Operater01 {

	public static void main(String[] args) {
		int num1 = 5;
		System.out.println(++num1); // 6
		System.out.println(++num1); // 7
		System.out.println(num1); // 7
		System.out.println();
		int num2 = 5;
		System.out.println(num2++); // 5
		System.out.println(num2++); // 6
		System.out.println(num2); // 7

		
		
		int a = 10;
		int b = 20;
		
		int result = a++ * ++b;
		System.out.println("a: "+a);
		System.out.println("a: "+b);
		System.out.println("result: "+result);
	}

}
