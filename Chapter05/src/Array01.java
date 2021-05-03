import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		int[] java;
		
		int[] oracle = new int[20];
		//20칸 짜리 빈 배열을 만들어서 oracle이라는 이름을 붙인다.
		
		int[] html = new int[] {10 ,20, 30, 40};
		//10 20 30 40이 들어간 배열[4]을 만들어서 html이라는 이름을 붙인다.
		
		
		//배열을 선언하면 크기를 변경할 수 없다.
		
		System.out.println("html : " +html);
		
		System.out.println("html[2] : " +html[2]);
		
		oracle[0] = 100;	//데이터 저장
		System.out.println(oracle[0]);
		oracle[0] = 200;	//데이터 변경
		System.out.println(oracle[0]);
		System.out.println("/////////////////////");
		int num = 10;
		oracle[num] = 50;
		System.out.println(oracle[10]);
		
		int[] css = {20, 25, 40, 30};
		System.out.println("css[0] : "+css[0]);
		System.out.println("css[1] : "+css[1]);
		System.out.println("css[2] : "+css[2]);
		System.out.println("css[3] : "+css[3]);
		System.out.println("---------------------");
		
		int sum = 0;
		for(int i=0;i<css.length;i++) {
			System.out.println("css["+i+"] : "+css[i]);
			sum+=css[i];
		}
		System.out.println("css[i]의 합계 : "+sum);
		System.out.println("---------------------");
		
		System.out.println("css 배열의 크기 : "+css.length);
		System.out.println("oracle 배열의 크기 : "+oracle.length);
		System.out.println("---------------------");
		int[] data = {78,85,72,95,86,90}; //선언과 동시에 저장할 경우에만
										  //new int[]를 생략할 수 있다.
		
		// int[] data ={~~,~~,~~,~~} or
		// int[] data = new int[~~]; or
		// int[] data;
		// data = new int[]{~~,~~,~~,~~};
		sum=0;
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		double avg=sum/(double)data.length;
		System.out.println("합계 : "+sum+" 평균 : "+avg);
		
		System.out.println("---------------------");
		
		//응용
		
		int[] Scores = new int[] {10, 20, 30, 40};
		// Scores는 배열을 담을 수 있는 변수 =>[]
		// int[]는 배열에 담을 수 있는 데이터가 int형 데이터
		// (모든 데이터타입)[] 기본과 참조 전부 가능
		
		String[] str = new String[] {"자바","웹개발","안지훈"};
		
		Scanner[] scan =
				new Scanner[] {new Scanner(System.in), new Scanner(System.in), new Scanner(System.in)};
		
		
		
		}
	}                      