package array;

public class LastLetter {
	public static void main(String[] args) {
		String[] name={"manoj","kumar","dinesh","karthi","suresh"};
		for(int i=0;i<=name.length-1;i++) {
			int len=name[i].length();
			System.out.println(name[i].charAt(len-1)+","+name[i].charAt(i));
	}

	}
}
