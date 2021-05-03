
public class ArrayPptQuestion05 {

	public static void main(String[] args) {
		int[] nums = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			
		}
		System.out.println("------------------------------");
		
		int max=0;
		for(int i=0;i<nums.length;i++) {
			if(max<nums[i]) {
				max=nums[i];
			}
		}
		System.out.println("최대값 : "+max);
		max=0;
		int index=-1;
		for(int i=0;i<nums.length;i++) {
			if(max<nums[i]) {
				max = nums[i];
				index=i;
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최대값을 가진 배열의 인덱스 : "+index);
	}

}
