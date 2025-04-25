package numbers;

public class Number_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345;
		int len=0;
		while(num!=0) {
			len++;
			num=num/10;
		}
		System.out.println(len);
	}

}
