package ex01;

public class Card01 {
	String kind;
	int number;
	
	public Card01(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	public Card01() {
		this("Spade",1);
	}
	@Override
	public String toString() {
		return "종류 : "+kind+", 숫자 : "+number;
	}
	
	
}
