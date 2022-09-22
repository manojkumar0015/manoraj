package array;

public class MaxValues {
	public static void main(String[] args) {
		int[] num= {65,89,547,69,69,89};
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
			max=num[i];
			
		}
		}
		System.out.println(max);
		
		
	}
}


