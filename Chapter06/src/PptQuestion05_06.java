
public class PptQuestion05_06 {

	public static void main(String[] args) {
		//오른쪽 5번, 6번문제
				
		int[] nums = {78, 54, 89, 57, 84, 95, 74, 91, 84, 67, 52, 94, 82};
		sum(nums);
		avg(nums);
	}
	
	public static void sum(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];			
		}
		System.out.println("배열의 총합: "+sum);
	}
	
	public static void avg(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		
		double avg=sum/(double)nums.length;
		System.out.println("배열의 평균 : "+avg);
	}
	

}
