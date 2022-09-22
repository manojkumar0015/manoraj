package array;

public class PrintStringLength {
	public static void main(String[] args) {
		String[] names= {"manojkumar","dinesh","kumar","siva"};
		String min=names[0];
		
		/*for(int i=0;i<names.length;i++) {
			if(names[i].length()>max.length()) {
			max=names[i];
			
		}
	}
		System.out.println(max);*/
		
		for(int i=0;i<names.length;i++) {
			if(names[i].length()<min.length()) {
				min=names[i];
			}
		}
		System.out.println(min);

}
}
