package numbers;

public class Numbers_CommonDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=150,n=253;
		
		String num1 = Integer.toString(m);
		String num2 = Integer.toString(n);
		
		for(int i=0;i<num1.length();i++) {
			if(num1.charAt(i) == num2.charAt(i)) {
				System.out.println(num1.charAt(i));
			}
		}
	}

}
