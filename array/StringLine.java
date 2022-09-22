package array;

public class StringLine {
	public static void main(String[] args) {
		String[] name= {"manoj","kumar","dinesh","siva"};
		String total="";
		for(int i=0;i<name.length;i++) {
			total=total+name[i]+",";
		}
			System.out.println(total);
		}
	}


