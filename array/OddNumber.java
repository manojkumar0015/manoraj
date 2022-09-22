package array;

public class OddNumber {
	public static void main(String[] args) {
		int[] value= {65,-98,69,56,48};
		for(int i=0;i<value.length;i++) {
			if(value[i]%2==0) {
				System.out.println(value[i]+"is even number");
			}
			else {
				System.out.println(value[i]+"is odd number");
				
			}
		
		
		}
	}

}
