package array;

public class FintAverage {
	public static void main(String[] args) {
		int[] nums= {54,89,69,52,74};
		int total=0;
		for(int i=0;i<nums.length;i++) {
			total=total+nums[i];
			
		}
		System.out.println(total/nums.length);
		
	}

}
