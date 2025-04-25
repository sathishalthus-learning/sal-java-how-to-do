package strings;

public class Strings_SeperateNumeicsAlphabets {

	public static void main(String[] args) {
		// 
		
		String str =" 1bb12b2bbb43b4b";
		String alpha="", numeric="";
		for(char ch: str.toCharArray()) {
			if(Character.isAlphabetic(ch)) {
				alpha = alpha + ch;
			}
			if(Character.isDigit(ch)) {
				numeric = numeric+ch;
			}
		}
			System.out.println(alpha+numeric);
	}

}
