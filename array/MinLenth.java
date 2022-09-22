package array;

public class MinLenth {
	public static void main(String[] args) {
		String[] name= {"jp","manoj kumar","siva","suresh","rajesh"};
		String min=name[0];
		for(int i=0;i<name.length;i++) {
			if(name[i].length()<min.length()) {
				min=name[i];
			}
		}
		System.out.println(min);
			}
			
			
			
		
		
	

	}


