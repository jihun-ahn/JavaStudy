import java.util.Random;

public class InputRandom01 {

	public static void main(String[] args) {
			//자바로 임의의 숫자를 만드는 방법
		
//		int rand = (int)(Math.random()*45)+1;
//		// 0.0 <= mathRandom < 1.0 임의의 실수
//		System.out.println(rand);
//		// 0.0 <= Math.random * 45 < 45.0
//		// 0 <= (int)(Math.random()*45) < 45
//		// 1 <= (int)(Math.random()*45)+1 < 46
//		
//		//주사위
//		
//		int dice1 = (int)(Math.random()*6)+1;
//		
//		System.out.println("주사위 눈: "+dice1);
		
		Random ran = new Random();
		int a = ran.nextInt(3);
		System.out.println(a);
		
	}

}
