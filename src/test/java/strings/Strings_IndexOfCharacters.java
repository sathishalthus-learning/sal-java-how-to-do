package strings;

public class Strings_IndexOfCharacters {

	public static void main(String[] args) {
		// 
		String str = "hello world";
		// even index characters
		for(int i=0; i<=str.length()-1;i++) {
			if(i%2==0) {
				System.out.println(str.charAt(i));
			}
		}
		
		// odd 
		// even index characters
		for(int i=0; i<=str.length()-1;i++) {
			if(i%2!=0) {
				System.out.println(str.charAt(i));
			}
		}
	}

}
