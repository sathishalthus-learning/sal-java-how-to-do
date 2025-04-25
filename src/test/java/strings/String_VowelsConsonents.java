package strings;

import java.util.HashMap;
import java.util.Map;

public class String_VowelsConsonents {

	public static void main(String[] args) {
		// 
		String str = "helalaoiua";
		Map<Character,Integer> vowels=new HashMap<Character, Integer>();
		Map<Character,Integer> consonants=new HashMap<Character, Integer>();
		//
		for(char ch: str.toCharArray()) {
			// Vowels
			if(ch=='a'||ch=='e' || ch=='i'||ch=='o'||ch=='u') {
				Integer i = vowels.get(ch);
				vowels.put(ch, i==null?1:++i);
			}
			// Consonants
			else {
				Integer i = consonants.get(ch);
				consonants.put(ch, i==null?1:++i);
				
			}
	
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}

}
