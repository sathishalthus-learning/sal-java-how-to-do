package numbers;

public class Number_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345;
		int sum =0;
		while(num!=0) {
			int digit = num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);

	}

}
