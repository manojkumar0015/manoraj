package array;

public class PrintPlurals {
	public static void main(String[] args) {
		String[] names={"laptops","keyboard","monitor","printers","webcames"};
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith("s")) {
				System.out.println(names[i]);
			}
		}
		
	}

}
