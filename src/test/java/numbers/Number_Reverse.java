package numbers;

public class Number_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123;
		int act = num, rev=0;
		System.out.println(act);
		
		
		while(num!=0) {
			int remainder = num%10;
			rev = rev*10+ remainder;
			num=num/10;
		}
		System.out.println(rev);
	}

}
