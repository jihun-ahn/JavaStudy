
public class Card {


	//생성자를 만들지 않으면 빈 생성자 자동생성
	//생성자를 만들면 빈 생성자는 생성되지않음
	int num = 1;
	boolean chk=true;

	public Card(int num, boolean chk) {
		this.num = num;	//  "this"는 현재 있는 클래스를 나타냄
						//인스턴스 생성시 입력한 num로 인스턴스 내부의 num필드를 초기화
		this.chk = chk;
	}


	public Card() {

	}


	public String info() {
		String str = "";
		if(chk==true) {
			str=String.valueOf(num)+"k";
		}else {
			str = String.valueOf(num);
				  //숫자를 문자열로 변환
		}	

		return str;
	}
}
