package strings;

public class PrefixOfWords {

	public static void main(String[] args) {
		//

		String[] strs = { "flower", "flow", "flight" };

		//
		String prefix = strs[0];
		
		for(int i=1; i<strs.length;i++) {
			
			while(strs[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0, prefix.length()-1);
			}
			
		}
		if(prefix != null) {
		System.out.println(prefix);
		
		}
		else
		{
			System.out.println("no common prefix");
		}
		
		
		
		
		
//		int minLength=strs[0].length();
//		
//		for(String str:strs) {
//			if(str.length()<minLength) {
//				minLength = str.length();
//			}
//		}
//		System.out.println(minLength);
//
//		for(int i=0;i<=minLength-1;i++) {
//			boolean b = false;
//			char letter = strs[0].charAt(i);
//			for(String str:strs) {
//				if(letter == str.charAt(i)) {
//					b=true;
//				}
//			}
//			if(b) {
//				prefix.append(letter);
//			}
//		}
//		
		
//		System.out.println(prefix);

	}

}
