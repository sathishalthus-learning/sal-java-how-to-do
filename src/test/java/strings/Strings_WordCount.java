package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Strings_WordCount {
	//
	public static void main(String[] args) {
		//
		String str = "hi hi hi hello hello welcome to java";
		String[] words = str.split(" ");
		//
		Map<String,Integer> wordMap = new HashMap<String, Integer>();
		for (String word: words) {
			Integer count = wordMap.get(word);
			wordMap.put(word,(count==null?1:++count));
		}
		
		// duplicates
		for (Map.Entry<String, Integer> item: wordMap.entrySet()) {
			if(item.getValue()>1) {
				System.out.println(item);
			}
		}
		
		System.out.println(wordMap);

	}
}
