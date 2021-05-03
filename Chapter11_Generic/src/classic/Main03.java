package classic;

public class Main03 {

	public static void main(String[] args) {
		// 과일 담는 박스 생성
		Box aBox = new Box();
		Box bBox = new Box();

		//과일 객체를 생성해서 박스에 담는다.
		aBox.set("Apple");   // String
		bBox.set("Banana");

		// 박스에 과일을 꺼낸다.,
		Apple ap = (Apple)aBox.get();  //Object
		Banana bn = (Banana)bBox.get();

		// 과일이 맞는지 체크
		System.out.println(ap.toString());
		System.out.println(bn.toString());
	}

}
