
package array;

public class Averege {
	public static void main(String[] args) {
		int[] num= {65,56,45,87,98};
		int total =0;
		int count=0;
		for(int i=0;i<=num.length-1;i++) {
			total=total+num[i];
			count++;
		}
		int average=total/count;
		System.out.println(average);
			
		}
	
	}


