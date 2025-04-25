package strings;

import java.util.Scanner;

public class Strings_CapitaliseEachWord {

	public static void main(String[] args) {
		// 
		String sentence = "hello welcome java world";
		
		String[] words = sentence.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String firstChar = words[i].substring(0,1);
			System.out.print(firstChar.toUpperCase());
			System.out.print(words[i].substring(1));
			System.out.print(" ");
		}

	}

}
