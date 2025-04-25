package strings;

public class Strings_SeperateLowercaseUppercase {

	public static void main(String[] args) {
		// 
		String str = "AaBbCcDd";
		String upper="",lower="";
		
		for(char ch:str.toCharArray()){
			if(Character.isUpperCase(ch)) {
				upper = upper+ch;
			}
			else if(Character.isLowerCase(ch)){
				lower=lower+ch;
			}
		}
			System.out.println(upper + lower);
	}

}
