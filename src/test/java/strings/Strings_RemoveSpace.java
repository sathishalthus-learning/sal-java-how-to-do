package strings;

public class Strings_RemoveSpace {

	public static void main(String[] args) {
		// 
		
		String str = "hellow hel   lo";
		String result = "";
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)!=' ') {
				result = result+str.charAt(i);
			}
		}
		System.out.println(result);
	}

}
