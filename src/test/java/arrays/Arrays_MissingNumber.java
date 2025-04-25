package arrays;

public class Arrays_MissingNumber {

	public static void main(String[] args) {
		// 
		int[] array = {1, 2, 4, 5, 6};
		
		for(int i=1;i<array.length-1;i++) {
			if(array[i+1]-array[i]!=1) {
				System.out.println(array[i]+1);
			}
		}

	}

}
