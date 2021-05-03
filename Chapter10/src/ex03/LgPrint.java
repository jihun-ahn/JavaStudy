package ex03;

public class LgPrint implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("Lg프린터");		
		System.out.println(doc+"를 인쇄합니다.");
	}

}
