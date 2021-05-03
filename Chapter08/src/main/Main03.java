package main;

public class Main03 {

	public static void main(String[] args) {
//		Singleton01 s = new Singleton01();
		Singleton01 s = Singleton01.getInstance();
		
		s.setField("안녕하세여");
		System.out.println(s.getField());
		
		
		Singleton01 s2 = Singleton01.getInstance(); 
		System.out.println(s2.getField());
		
		
	}

}
