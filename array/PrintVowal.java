package array;

public class PrintVowal {
	public static void main(String[] args) {
		String[] names= {"ttt","agek","fgh","alone","sky"};
		int count=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].contains("a")||names[i].contains("e")||names[i].contains("o")) {
				count=count+1;
			}
		}
		System.out.println(count);
		
	}

}
