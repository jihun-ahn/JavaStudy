package Question;

import java.util.Random;
import java.util.TreeSet;

public class Q01 {
	
	static Random r = new Random();
	static TreeSet<Integer> lotto = new TreeSet<>();

	public static void main(String[] args) {
//		1. 로또번호(1부터 45까지 6개)를 뽑아서 출력합니다.
//		단 중복된 번호가 없어야 하고 번호를 오름차순으로 정렬해서 출력하세요.
		
//		while(lotto.size() < 6) {
//			int num = r.nextInt(45)+1;
//			lotto.add(num);
//		}
//		for(;;) {}
		
		for(;lotto.size()<6;) {
			int num = r.nextInt(45)+1;
			lotto.add(num);
		}
		
		for(int num:lotto) {
			System.out.print(num+",");
		}


		
		// Wrapper클래스
		//  기본타입의 데이터를 아무런 기능(메서드)를 가질수 없다.
		// 기본타입의 데이터와 관련된 메서드의 결합   => Wrapper클래스 
		// byte    => Byte
		// short   => Short
		// int     => Integer
		// long    => Long
		// float   => Float
		// double  => Double
		// boolean => Boolean
		// char    => Character
		
		int num = 100;
		Integer number = new Integer(num);  //박싱
		number = Integer.valueOf(num);  //박싱
		int result = number.intValue();    //언박싱
		
		int stringToInt = Integer.parseInt("100");
		
		number = num;  // 자바 1.8에서는 Auto 박싱 언박싱이 작동된다.
		result = number;
		
		
		double stringToDouble = Double.parseDouble("3.14");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
