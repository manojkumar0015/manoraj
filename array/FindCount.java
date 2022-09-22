package array;

public class FindCount {
	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0]=51;
		nums[1]=41;
		nums[2]=96;
		nums[3]=36;
		nums[4]=36;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=1) {
				count=count+1;
			}
		}
		System.out.println(count);
			
	}

}
