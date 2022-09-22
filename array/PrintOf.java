package array;

public class PrintOf {
	public static void main(String[] args) {
		int[] nums= {10,25,69,94,69,69,};
		/*for(int i=0;i<nums.length/2;i++) {
			System.out.println(nums[i]);
		}*/
		for(int i=nums.length/2;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		/*for(int i=nums.length-1;i<nums.length/2;i++) {
			//System.out.println(nums[i]);
		}*/
	}

}
