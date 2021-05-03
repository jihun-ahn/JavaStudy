
public class PptQuestion07 {

	public static void main(String[] args) {

		int[] nums1 = {78,54,89,57,84};
		int[] nums2 = {95,74,91,84};
		
		sumArray(nums2, nums1);
	}



	public static void sumArray(int[] nums1, int[] nums2) {
		int[] numsSum;
		if(nums1.length>nums2.length) {
			numsSum = new int[nums1.length];
			for(int i=0;i<nums1.length;i++) {
				if(i>nums2.length-1) {
					numsSum[i]=nums1[i];
				}else {
					numsSum[i]=nums1[i]+nums2[i];
				}				
			}
		}else {
			numsSum = new int[nums2.length];
			for(int i=0;i<nums2.length;i++) {
				if(i>nums1.length-1) {
					numsSum[i]=nums2[i];
				}else {

					numsSum[i]=nums1[i]+nums2[i];
				}
			}
		}
		System.out.print("{");
		for(int i=0;i<numsSum.length;i++) {
			if((i+1)==numsSum.length) {
				System.out.printf("%d", numsSum[i]);
			}else {
			System.out.printf("%d,", numsSum[i]);
			}	
		}
		System.out.print("}");
	}
}
