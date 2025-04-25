package strings;

public class Strings_ReverseByWords {
	public static void main(String[] args) {
		//
		String str = "Hi Hello Welcome to Java";
		String reversed="";
		//
		String[] words = str.split(" ");
		//
		for(int i = words.length-1;i>=0;i--) {
			reversed = reversed + " " + words[i];
			
		}
		System.out.println(reversed);
	}
}
