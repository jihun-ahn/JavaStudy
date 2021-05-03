package ex01;

public class Main_String {

	public static void main(String[] args) {
		char c = ' ';
		String s = "";
		
		String str1 = "Java And Python Programming";
		
		System.out.println(str1.toLowerCase());//소문자
		System.out.println(str1.toUpperCase());//대문자
		
		String str2 = "     java      ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		String str3 = "Java Progamming";
		byte[] bytes = str3.getBytes();
		
		for(byte b:bytes) {
			System.out.print(b);
			System.out.print(",");
		}
		System.out.println();
		String str4 = new String(bytes);
		System.out.println(str4);
		
		
		String str5 = "Java ";
		String str6 = " Progamming";
		
		System.out.println(str5+str6);
		
		System.out.println(str5.concat(str6));
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java");
		sb.append(" And ");
		sb.append("Python");
		sb.append(" programming");
		
		System.out.println(sb.toString());
		
		String str7 = "Java Progamming";
		String str8 = str7.substring(5, 11);
		System.out.println(str8);
		
//									5~11  => 5,6,7,8,9,10
		
		String now = "2021-04-22";
		String year = now.substring(0,4);
		String month = now.substring(5,7);
		String day = now.substring(8);
		
		System.out.println(year+"년 "+month+"월 "+day+"일");
	
		
	}

}























