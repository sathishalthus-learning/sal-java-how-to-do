package numbers;

public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int decimal = 1;
		int quotient=0,remainder=0;
		
		String result;
		StringBuilder string = new StringBuilder("");
		
		while(decimal!=0) {
			remainder = decimal%2;
			decimal = decimal/2;
					string = string.insert(0, remainder);
			
		}
		System.out.println(string);
		System.out.println(Integer.toBinaryString(1));

	}

}
