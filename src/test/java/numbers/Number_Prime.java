package numbers;

public class Number_Prime {

	public static void main(String[] args) {
		//
		int number = 4;
		int count = 0;

		// basic
		if (number <= 1) {
			System.out.println("Not Prime");
		} else {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(" prime");
			} else {
				System.out.println("not prime");
			}
		}
	}
}
