
package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Strings_Anagram {

	public static void main(String[] args) {
		// 
		String str1 ="aabbcc";
		String str2 = "abcbca";
		
		// using char array
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		System.out.println(Arrays.equals(chars1, chars2));
		
		// using map
		Map<Character,Integer> map1 = new HashMap<Character, Integer>();
		Map<Character,Integer> map2 = new HashMap<Character, Integer>();
		
		 for(char ch:str1.toCharArray()) {
			 Integer i = map1.get(ch);
			 map1.put(ch,i==null?1:++i);
		 }
		 
		 for(char ch:str2.toCharArray()) {
			 Integer i = map2.get(ch);
			 map2.put(ch,i==null?1:++i);
		 }
		 
		 if(map1.entrySet().containsAll(map2.entrySet())) {
			 System.out.println("true");
		 }
		 
		 }
	}

