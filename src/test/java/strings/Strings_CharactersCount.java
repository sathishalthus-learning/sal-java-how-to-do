package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Strings_CharactersCount {

	public static void main(String[] args) {
		// 
		
		String str= " Hellow World Java";
		char[] chars = str.toCharArray();
		
		Map<Character,Integer> counts = new HashMap<Character,Integer>();
		for(char c:chars) {
			if(counts.containsKey(c)) {
				counts.put(c, counts.get(c)+1);
			}else
			{
				counts.put(c, 1);
			}
		}
//		System.out.println(counts);
		
		for(char c :counts.keySet()) {
			if(counts.get(c)>1) {
				System.out.println(c +" "+ counts.get(c));
			}
		}

	}

}
