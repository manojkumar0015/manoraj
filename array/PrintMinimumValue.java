package array;

public class PrintMinimumValue {
	public static void main(String[] args) {
		int[]nums=new int[6];
		nums[0]=56;
		nums[1]=69;
		nums[2]=64;
		nums[3]=87;
		nums[4]=45;
		nums[5]=15;
		/*int min=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		
			System.out.println(min);
			}
}*/
		int max=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println(max);
}
}
			
		
		
		
		
		
		
		
	


