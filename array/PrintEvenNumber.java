package array;

public class PrintEvenNumber {
	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0]=64;
		nums[1]=71;
		nums[2]=57;
		nums[3]=48;
		nums[4]=71;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]);
			}
		}
	}

}
