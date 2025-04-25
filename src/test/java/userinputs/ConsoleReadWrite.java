package userinputs;

import java.io.Console;

public class ConsoleReadWrite {

	public static void main(String[] args) {
		// 
		Console console = System.console();
		String language = console.readLine("Enter Language");
		console.printf(language);
		

	}

}
