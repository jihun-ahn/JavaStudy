package ex01;

import java.util.Date;

public class Main_value01 {

	public static void main(String[] args) {
		Value01 v1 = new Value01(5);
		Value01 v2 = new Value01(5);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		System.out.println("v1.hashcode : " + v1.hashCode());
		System.out.println("v2.hashcode : " + v2.hashCode());
		System.out.println("v1.hashcode : " + v1.toString());
		System.out.println("v2.hashcode : " + v2.toString());
		
		v2 = v1;
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		System.out.println("v1.hashcode : " + v1.hashCode());
		System.out.println("v2.hashcode : " + v2.hashCode());
		
		
		String str = new String("쉬었다 합시다.");
		System.out.println(str);
		System.out.println(str.toString());
		
		Date today = new Date();
		System.out.println(today.toString());
		
		
		
		
		
		
	}

}
