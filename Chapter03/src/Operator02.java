
public class Operator02 {

	public static void main(String[] args) {
		/* 문자열 비교는 특별한 기능이 필요하다.
		 * 단순 비교연산을 하면 
		 * String은 메모리상으로 비교하기 때문에 같다고 나타난다.
		 * new String을 사용해 다른 주소에 위치하게 하고 같은 내용을 담으면 같지 않다는 출력이 나온다.
		 *
		 * a.equals(b) 라는 명령을 사용해서 비교하는것이 좋다.
		 */
		String str1 = "안녕";
		String str2 = "안녕";
		
		System.out.println("str1 == str2 : " +(str1==str2));
		
		String str3 = new String ("안녕");
		String str4 = new String ("안녕");
		
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		System.out.println();
		System.out.println("str3 == str4 : " +(str3==str4));
		System.out.println("str3.equals(str4) : "+(str3.equals(str4)));




	}

}
