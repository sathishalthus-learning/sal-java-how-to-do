package userinputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInOut {

	public static void main(String[] args) throws IOException {
		try (// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in)) {
			// line
//			String name = scanner.nextLine();
//			System.out.println("User Input : " + name);
//			// token
//			String firstName = scanner.next();
//			System.out.println("First Name : " + firstName);
//			String lastName = scanner.next();
//			System.out.println("Last Name : " + lastName);
//			// numbers
//			int age = scanner.nextInt();
//			System.out.println("Age is : " + age);
			//
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(br.readLine());
		}

	}

}
