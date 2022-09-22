package array;

public class mailId {
	public static void main(String[] args) {
		String word="ManojBE.187@Gmail.Com";
		char[] letter=word.toCharArray();
		int UpperCaseCount=0;
		int LowerCaseCount=0;
		int numberCount=0;
		int symbleCount=0;
		for(int i=0;i<letter.length;i++) {
			if(letter[i]>='A'&&letter[i]<='Z') {
				
				UpperCaseCount++;
			}
			else if(letter[i]>='a'&&letter[i]<='z') {
				LowerCaseCount++;
			}
			else if(letter[i]>=0&&letter[i]<=9) {
				numberCount++;
			}
			else {
				symbleCount++;
			}
		}
		System.out.println("Upper Case= "+UpperCaseCount++);
		System.out.println("Lower Case= "+LowerCaseCount++);
		System.out.println("number Case= "+numberCount++);
		System.out.println("syble Case= "+symbleCount++);
	

}
