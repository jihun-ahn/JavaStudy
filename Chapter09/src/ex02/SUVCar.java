package ex02;

public class SUVCar extends Car{

	@Override
	public void forward() {
		super.speed +=2;
		System.out.println("4WD로 전전합니다.");
	}
	
	
}
