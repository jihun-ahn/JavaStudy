package lotto;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Controller();
		
		//Wrapper클래스
		//기본타입의 데이터는 아무런 기능(메서드)를 가질수 없다.
		//기본타입의 데이터와 관련된 메서드의 결합 =>Warpper클래스
		
		/* byte=>Byte
		 * short => Short
		 * int => Integer
		 * long => Long
		 * float => Float
		 * double => Double
		 * boolean => Boolean
		 * char => Character
		 * 
		 * int num=100;
		 * Integer number = new Integer(num); 박싱
		 * number = Integer.valueOf(num); 박싱
		 * int result = number.intValue(); 언박싱
		 * 
		 * number = num;  자바에서는 auto 박싱 언박싱이 작동된다
		 * result = number; 
		 * 
		 * 
		 */
		
	}

}
