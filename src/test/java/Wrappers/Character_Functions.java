package Wrappers;

public class Character_Functions {

	public static void main(String[] args) {
		// 
		
		char letter = 'a';
		char number = '1';
		char symbol = '$';
		char space = ' ';
		char whitespace = '	';

		// is
		System.out.println("isDigit " + Character.isDigit(number));
		System.out.println("isLetter " + Character.isLetter(letter));
		System.out.println("isLetterOrDigit " + Character.isLetterOrDigit(symbol));
		System.out.println("isUpperCase " + Character.isUpperCase(letter));
		System.out.println("isLowerCase "+Character.isLowerCase(letter));
		System.out.println("isSpaceChar " + Character.isSpaceChar(space));
		System.out.println("isWhiteSpace " + Character.isWhitespace(whitespace));
		
		
		//to
		System.out.println("toUpperCase " + Character.toUpperCase(letter));
		System.out.println("toLowerCase " + Character.toLowerCase(letter));
		System.out.println("toString " + Character.toString(letter));
		
		// values
		System.out.println("valueOf " + Character.valueOf(letter));
		System.out.println("valueOf " + Character.getNumericValue(letter));
	}

}
