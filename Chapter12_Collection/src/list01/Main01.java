package list01;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(); // arrayList를 사용하겠습니다.

		names.add("고길동");//0
		names.add("안현필");//1
		names.add("홍성대");//2
		names.add("한석원");//3
		names.add("설민석");//4
//////////////////////////////////////////////////////////////		
		System.out.println("리스트의 길이 : "+names.size());
/////////////////////////////////////////////////////////////////		
		System.out.println("3번재 사람 이름 : "+names.get(2));
		String name1 = names.get(1);
		System.out.println("2번재 사람 이름 : "+name1);
/////////////////////////////////////////////////////////////////
		System.out.println("4번째 사람 이름 : "+names.get(3));
		names.add(3,"최진기");
		System.out.println("4번째 사람 이름 : "+names.get(3));
		System.out.println("5번째 사람 이름 : "+names.get(4));
/////////////////////////////////////////////////////////////////		
		System.out.println("리스트의 길이 : "+names.size());
		
		System.out.println("2번째 사람 이름 : "+names.get(1));
		names.remove(1);
		System.out.println("2번째 사람 이름 : "+names.get(1));
/////////////////////////////////////////////////////////////////		
		for(int i=0;i<names.size();i++) {
			//		  names.length
			System.out.println((i+1)+"번째 사람 이름 : "+names.get(i));
			//										names[i].getName();
		}
	}

	
	
	
}
