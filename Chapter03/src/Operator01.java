
public class Operator01 {

	public static void main(String[] args) {
		int num1 = 5;
		System.out.println(++num1); //6
		System.out.println(++num1); //7
		System.out.println(num1);   //7
		System.out.println();
		
		int num2 = 5;
		System.out.println(num2++); //5
		System.out.println(num2++); //6
		System.out.println(num2);   //7
		
//		int xxx = 10;
//		xxx++;
//		++xxx;
//		System.out.println(xxx);
		
		int a = 10;
		int b = 20;
		
		int result = a++ * ++b;
		//            10   20
		//            10   21
		//   210      10 * 21
		//            11   21
		
		
		System.out.println("a : "+a);//11
		System.out.println("b : "+b);//21
		System.out.println("result : "+result);//210
		
		
	}
}
