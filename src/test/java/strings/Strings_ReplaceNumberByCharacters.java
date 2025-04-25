package strings;

import java.util.HashMap;
import java.util.Map;

public class Strings_ReplaceNumberByCharacters {

	public static void main(String[] args) {
		// 
		String str = "aabbccccdddd";
		char[] chars = str.toCharArray();
		String res="";
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c : chars)
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else
			{
				map.put(c, 1);
		}
		for(Map.Entry<Character, Integer> c : map.entrySet()) {
			res=res+c.getKey().toString()+c.getValue().toString();
		}
		System.out.println(res);
	}

}
