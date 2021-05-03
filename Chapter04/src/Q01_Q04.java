
public class Q01_Q04 {

	public static void main(String[] args) {
		//1번 문제. 1부터 100까지 합

		//for문
//		int sum = 0;
//		for(int i=1;i<=100;i++) { //for(;;)는 무한반복을 의미함
//			sum+=i;
//		}
//		System.out.println("합계 : "+sum);		
//
//
//		//while문
//		int i=0;
//		sum=0;
//		while(i<=100) {	
//			sum+=i;
//			i++;
//		}
//		System.out.println("합계 : "+sum);		

		// 2, 3번 문제. 1부터 100까지 7의 배수의 합과 산술평균
//		int sum = 0;
//		int count = 0;
//		
//		for(int i=1;i<=100;i++) {
//			if((i%7)==0) {
//			sum+=i;
//			count++;
//			}
//		}
//		double avg = sum/(double)count;
//		System.out.println("합 :"+sum);
//		System.out.println("평균 : "+avg);
		
		// 4번 문제. 1부터 100까지 합을 구하되 합계1000이되면 중단하고 합계출력
		// 1000이 넘어가는 순간의 항을 구하라
		int count = 0;
		int j = 0;
		for(int i=1;i<=100;i++) {
			count+=i;
			if(count>=1000) {
				j=i;
				break;
			}
		
		}
		System.out.println("합계 : "+count);
		System.out.println("1000이 넘어가는 순간의 항 : "+j);	

	}

}
