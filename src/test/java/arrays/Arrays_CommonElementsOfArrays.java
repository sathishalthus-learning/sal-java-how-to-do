package arrays;

import java.util.HashSet;
import java.util.Set;

public class Arrays_CommonElementsOfArrays {

	public static void main(String[] args) {
		// 
		int[] array1 = {1, 2, 3, 4, 5}; 
		int[] array2 = {4, 5, 6, 7, 8}; 
		//
		Set<Integer> set1 = new HashSet<Integer>();
		for(int a : array1) {
			set1.add(a);
		}
		Set<Integer> set2 = new HashSet<Integer>();
		for(int b : array2) {
			set2.add(b);
		}
		
		for(Integer i : set1) {
			if(set2.contains(i)) {
				System.out.println(i);
			}
		}

	}

}
