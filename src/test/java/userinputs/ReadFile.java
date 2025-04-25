package userinputs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReadFile {

	public static void main(String[] args) {
		// 
		
		List<String> list = new ArrayList<>();
		list.add("on");
		list.add("off");
		list.add("on");
		
		long count = list.stream().count();
		System.out.println(count);
		
		long dcount = list.stream().distinct().count();
		System.out.println(dcount);
		
		
		Stream<String> no = list.stream().filter(element->element.contains("on"));
		
	}

}
