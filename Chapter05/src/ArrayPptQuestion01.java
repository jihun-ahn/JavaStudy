
public class ArrayPptQuestion01 {

	public static void main(String[] args) {
		//1번 문제
//		int[][] arr= {
//				{5,5,5,5,5},
//				{10,10,10},
//				{20,20,20,20},
//				{30,30},
//		};
//		System.out.println(arr[3].length); // 30,30에 해당하는 2

//		//2번문제
//		int[] arr=new int[]{10,15,47,23,51};
//		int sum=0;
//		for(int n:arr) {
//			sum+=n;
//		}
//		System.out.println(sum);
		
		//3번 문제
//		int[][] arr = {
//				{5,5,5,5,5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//		};
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int n:arr[i]) {
//				sum+=n;
//			}
//		}
//		System.out.println(sum);
		
		//4번 문제
		int[] rand = new int[3];
		for(int i=0;i<rand.length;i++) {				
			rand[i]=(int)(Math.random()*9)+1;			
			for(int j=0;j<i;j++) {
				if(rand[i]==rand[j]) {
					i--;
					break;
				}
			}
		}			
		for(int a:rand) {
			System.out.print(a);		
		}

		//		for(int a:rand) {
		//		System.out.print(a);		
		//		}


	}

}
