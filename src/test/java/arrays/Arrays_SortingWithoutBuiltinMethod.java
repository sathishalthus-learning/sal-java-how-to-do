package arrays;

public class Arrays_SortingWithoutBuiltinMethod {

	public static void main(String[] args) {
		// 
		int[] array = {5, 2, 9, 1, 6}; 
		
		//
		for(int i=0;i<=array.length-1;i++) {
			for(int j=0;j<=array.length-1;j++) {
				if(array[i]< array[j]) {
					int temp = array[i];
					array[i]=array[j];
					array[j]= temp;
				}
			}
		}
		for(int num: array) {
		System.out.println(num);
		}
	}

}
