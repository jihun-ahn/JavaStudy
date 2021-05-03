package ex02;

public class Main02 {

	public static void main(String[] args) {
		ConvertibleCar myCar = new ConvertibleCar();
		SUVCar yourCar = new SUVCar();
		
		
//		method1(myCar);
//		method2(yourCar);
		
		method(myCar);
		method(yourCar);
		
	}
	
	private static void method(Car car) {
		car.forward();
		
		if(car instanceof ConvertibleCar) {
			ConvertibleCar myCar = (ConvertibleCar)car;
			myCar.open();
		}
		
	}


//	private static void method2(SUVCar yourCar) {
//		yourCar.forward();
//	}
//
//	public static void method1(ConvertibleCar car) {
//		car.forward();
//	}
	
	

}
