package strings;

public class Strings_ReverseWordsAndCharacters {
	public static void main(String[] args) {
		//
		String str = "Hello World!";
		String[] words = str.split(" ");
		String rev="";
		//
		for(String word : words)
		{
			String rword="";
			for(int i=word.length()-1; i>=0;i--) {
				rword =  rword+ word.charAt(i);
			}
			rev =rword + " "+rev;
		}
		System.out.println(rev);
	}
}
