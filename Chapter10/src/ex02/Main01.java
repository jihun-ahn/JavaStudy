package ex02;

public class Main01 {  // 상속 => 특수한 예 : 추상클래스

	public static void main(String[] args) {
//		Animal animal = new Animal();
					//추상 클래스 자체는 인스터스 생성 불가
		
		Cat cat01 = new Cat();
		Dog dog01 = new Dog();
		
		cat01.sound();
		dog01.sound();
		
		////////////////////////////////////////////////////
		Animal animal = null;   // 추상 클래스이 다형성 특징
		
		animal = new Cat();
		animal.sound();
		
		animal = new Dog();
		animal.sound();
		
		/////////////////////////////////////////////////////
		animalsound(new Cat());  // 야옹!
		animalsound(new Dog());  // 멍멍!!
		
	}
	
	
	private static void animalsound(Animal ani) {
		ani.sound();
	}

}














