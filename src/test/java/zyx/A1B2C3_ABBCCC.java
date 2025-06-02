package zyx;

public class A1B2C3_ABBCCC {

	public static void main(String[] args) {
		// 
		String input = "A1B2C3";
		// solution 1
		for(int i=0;i<input.length();i=i+2) {
			char c = input.charAt(i+1);
			int count = Character.getNumericValue(c);
			for(int j=1;j<=count;j++) {
				System.out.print(input.charAt(i));
			}
		}
		
		//line break
		System.out.println();
		
		// solution 2
		
		char letter='a';
		int loop =0;
		
		for(char c: input.toCharArray()) {
			if(Character.isLetter(c)) {
				letter = c;
			}
			
			if(Character.isDigit(c)) {
				loop = Character.getNumericValue(c);
				for(int i=0; i<loop;i++) {
					System.out.print(letter);
				}
			}
			
		}
	}

}
