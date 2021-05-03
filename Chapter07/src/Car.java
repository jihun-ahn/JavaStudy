
public class Car {
		//멤버 필드
		String color = "white";
		int speed = 0;
		
		//생성자 = 메서드(반환타입이 없고 한번만 실행되고 이름은 클래스이름과 동일하다.
		//인스턴스의 초기화를 담당한다.
		//인스턴스를 생성할 때 외부 데이터를 입력받아서 인스턴스 필드를 채우겠다는 뜻
		public Car(String choiceColor) {
			color = choiceColor;
			System.out.println("차량 구매를 축하합니다.");
		}
		
		
		//멤버 메서드
		public void forward() {
			System.out.println("전진");
			speed++;
		}
		public void backwar() {
			System.out.println("후진");
			speed--;
		}
}