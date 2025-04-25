package numbers;

public class Number_Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int arm=0;
		
		while(num!=0) {
			int remainder = num%10;
			arm = (int) (arm + Math.pow(remainder, 3));
			num = num/10;
		}
		
		System.out.println(arm);
	}

}
