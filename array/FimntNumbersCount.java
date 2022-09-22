package array;

public class FimntNumbersCount {
	public static void main(String[] args) {
		int[] nums=new int[7];
		nums[0]=14;
		nums[1]=-48;
		nums[2]=89;
		nums[3]=11;
		nums[4]=-22;
		nums[5]=18;
		nums[6]=-88;
		int countPosstive=0;int countNegative=0;
		for(int i=0;i<nums.length;i++)
			if(nums[i]>0) {
				countPosstive=countPosstive+1;
			}
			else {
				countNegative=countNegative+1;
			}
		System.out.println("Passtive count"+countPosstive);
		System.out.println("negative count"+countNegative);
				
				
				
			
	}

}
