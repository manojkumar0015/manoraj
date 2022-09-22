package array;

public class PrintPasstiveNumber {
	public static void main(String[] args) {
		int[] nums= {69,59,-65,85,-14,95};
		/*for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				System.out.println(nums[i]);
				
			}
		}*/
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				System.out.println(nums[i]);
			}
		}
		
		
	}

}
