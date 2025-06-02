package arrays;

import java.util.HashSet;
import java.util.Set;

public class Arrays_RemoveDuplicates {

	public static void main(String[] args) {
		// 
		int[] array = {5, 2, 9, 1, 6, 2, 5}; 
		// Set
		Set<Integer> set = new HashSet<>();
		int i=0;
		for(int a:array) {
			set.add(a);
			i++;
		}
		System.out.println(set);
		System.out.println(i);
		
	}

}
