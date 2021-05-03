
public class Array02 {

	public static void main(String[] args) {
//		int[][] nums = new int[5][];
//		
//			nums[0] = new int[2];
//    int[]  num    = new int[2];
//		nums[1] = new int[3];
//		nums[2] = new int[5];
//		nums[3] = new int[7];
//		nums[4] = new int[1];
//		
//		
//		System.out.println("nums의 길이 : "+nums.length);
//		System.out.println("nums[0]의 길이 : "+nums[0].length);
//		System.out.println("nums[1]의 길이 : "+nums[1].length);
//		System.out.println("nums[2]의 길이 : "+nums[2].length);
//		System.out.println("nums[3]의 길이 : "+nums[3].length);
//		System.out.println("nums[4]의 길이 : "+nums[4].length);
//		
//		
//		nums[2][3] = 50;
		
		//자바 시험을 치뤘다.
		//1반 점수 87, 71, 64, 82
		//2반 점수 92, 88, 73, 61, 79
		//3반 점수 78, 53, 99, 87, 64, 75, 51, 93
		
		//하나의 배열에 담고 
		//각 반별 합계와 평균을 구해보세요.
		//학교 전체 학생의 자바 점수 합계와 평균 구하기
//		int[][] classScores = {
//							  {87, 71, 64, 82},
//							  {92, 88, 73, 61, 79},
//							  {78, 53, 99, 87, 64, 75, 51, 93}				
//							  };
		int sum=0; int allSum=0; double avg=0; double allAvg=0;
		
//		for(int i=0;i<classScores.length;i++) {
//			sum=0;
//			for(int j=0;j<classScores[i].length;j++) {
//				sum+=classScores[i][j];
//			}
//			allSum+=sum;
//			avg = sum/(double)classScores[i].length;
//			allAvg += classScores[i].length;
//			System.out.printf("%d반 합계 : %d, 평균 : %.1f \n",(i+1), sum, avg);
//		}
//		allAvg = allSum/(double)allAvg;
//		System.out.printf("총 합계 : %d 총 평균 : %.1f \n", allSum, allAvg);
		
		sum=0;
		
		//(향상된 for문) == (for-each문)
		int[] jsp = {10, 20, 30, 40, 50};
		for(int i=0;i<jsp.length;i++) { //일반적인 for문
			sum+=jsp[i];
			System.out.println(jsp[i]);
		}
		System.out.println("------------------");
		for(int n:jsp) { //향상된 for문
						 //jsp배열의 0번부터 순서대로 요소를 읽어와서 n에 담고 반복
			sum+=n;	
			System.out.println(n);

		}
		
		
	}
	
}
