package arrays;

import java.util.ArrayList;

public class Arrays_FirstandLast {

	public static void main(String[] args) {
		// 
		ArrayList<String> arrayList = new ArrayList<>(); 
		arrayList.add("Apple"); 
		arrayList.add("Banana"); 
		arrayList.add("Cherry"); 
		arrayList.add("Date"); 
		arrayList.add("Elderberry"); 
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(arrayList.size()-1));

	}

}
