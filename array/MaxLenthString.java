package array;

public class MaxLenthString {
	public static void main(String[] args) {
		String[] name= {"manoj kumar","dinesh","suresh","rajesh"};
		String max="";
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>max.length()) {
				max=name[i];
			}
		}
		System.out.println(max);
			}
			
			
			
		}
		
	


