package abcd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {
		
		// list
		List<String> names = new ArrayList<>();
		names.add("Larry");
		names.add("Sorry");

		names.forEach(name->{System.out.println(name);});
		
		// map
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "Larry");
		namesMap.put(2, "Steve");
		namesMap.put(3, "James");
		
		namesMap.forEach((key, value) -> {System.out.println(key + " " + value);});
		namesMap.entrySet().forEach(entry->{System.out.println(entry.getKey()+" "+entry.getValue());});
	}

}
