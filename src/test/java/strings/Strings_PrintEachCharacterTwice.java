package strings;

public class Strings_PrintEachCharacterTwice {

	public static void main(String[] args) {
		// 
		
		String str = "helo";
		String res = "";
		for(int i=0;i<=str.length()-1;i++) {
			res =res+str.charAt(i)+str.charAt(i);
		}
		System.out.println(res);
	}

}
