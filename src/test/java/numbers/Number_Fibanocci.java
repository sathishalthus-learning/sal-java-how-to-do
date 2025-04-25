package numbers;

public class Number_Fibanocci {

	public static void main(String[] args) {
		// 
		int first=0, second=1, next;
		int num=6;
		
		while(num!=0) {
			System.out.println(first);
			next = second+first;
			first = second;
			second = next;	
			num--;
		}

	}

}
