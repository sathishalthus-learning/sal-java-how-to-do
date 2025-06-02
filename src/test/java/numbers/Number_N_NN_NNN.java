package numbers;

import java.util.Date;

public class Number_N_NN_NNN {

	public static void main(String[] args) {
		
		int number=5;

		
		StringBuilder result = new StringBuilder();
		
		for(int i=1;i<=number;i++) {
			for(int j=1; j<=i;j++) {
			result.append(number);
			}
			if(i!=number) {
			result.append("+");
			}
		}
		
		System.out.println(result);
		Date date = new Date();
//		System.out.format(""%s", args[0]);
		System.out.println(date);
	}

}
