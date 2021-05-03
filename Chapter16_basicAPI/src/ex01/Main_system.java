package ex01;

public class Main_system {

	public static void main(String[] args) {
		System.out.println("운영체제 : "+System.getProperty("os.name"));
		System.out.println("사용자 이름 : "+System.getProperty("user.name"));
		System.out.println("사용자 홈디렉토리 : "+System.getProperty("user.home"));
	
		long milliTime = System.currentTimeMillis();  //밀리초
		long nanoTime = System.nanoTime();
		System.out.println("현재 시간 :"+milliTime);
		System.out.println("현재 시작(나노) : "+nanoTime);
	
		
		long startTime = System.nanoTime();
		long sum = 0;
		for(int i=0;i<100000000;i++) {
			sum+=i;
		}
		long endTime = System.nanoTime();
		
		System.out.println("합계 : "+sum);
		System.out.println("걸린 시간 : "+(endTime-startTime));
	}

}

