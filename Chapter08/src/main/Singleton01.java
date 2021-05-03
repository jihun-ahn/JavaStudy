package main;

public class Singleton01 {// -- 싱글턴 패턴--
	// 싱글턴클래스는 인스턴스를 못만들게 막는 것이 원칙
	// 단 하나의 인스턴스만 사용하도록 유도하는 것
	
	
	private Singleton01(){}
	
	private static Singleton01 s = new Singleton01();

	public static Singleton01 getInstance() {	
		if(s == null) {
			s = new Singleton01();
		}
		return s;
	}
	
	
	/////////////////////////////////////////////////////////////
	//필드
	private String field;
	
	//메서드
	public String getField() {
		return field;
	}


	public void setField(String field) {
		this.field = field;
	}
	
	
	
	
	
	
}
