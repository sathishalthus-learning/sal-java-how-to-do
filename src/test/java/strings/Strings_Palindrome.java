package strings;

public class Strings_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ammama";
		int start =0;
		int end = str.length()-1;
		boolean isPal=true;
		
		while(start<end) {
			if(str.charAt(start)!= str.charAt(end)) {
				isPal=false;
			}
			start++;
			end--;
		}
		if(isPal==true) {
			System.out.println("pal");
		}
		else
		{System.out.println("not pal");
		}
		
	}

}
