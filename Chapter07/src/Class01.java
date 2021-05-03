
public class Class01 {

	public static void main(String[] args) {
		String choiceColor = "skyblue";
		
		Car myCar = new Car(choiceColor);
		
		System.out.println("차량 색상: "+myCar.color);
		myCar.forward();
		System.out.println("차량의 속도: "+myCar.speed);
		
		Car yourCar = new Car("black");
		System.out.println("당신 차의 속도: "+yourCar.speed);
		
		myCar.color = "pink";
		System.out.println("내 차량 색상: "+myCar.color);
		System.out.println("당신의 차량 색상: "+yourCar.color);
		
		
		
	}

}
