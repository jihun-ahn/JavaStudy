package ex02;

public class Main01 {

	public static void main(String[] args) {
		Car myCar = new ConvertibleCar();
		//               forward, backward, open
		myCar.forward();
		myCar.backward();
//		myCar.open();
//////////////////////////////////////////////////////////////
		Car yourCar = new SUVCar();
		//			  forward(오버라이딩), backward
		yourCar.forward();
		yourCar.backward();
		
		SUVCar hisCar = (SUVCar)yourCar;
		hisCar.forward();
		hisCar.backward();
		
		
		
	}
	

}







