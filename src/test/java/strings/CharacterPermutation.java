package strings;

public class CharacterPermutation {

	public static void main(String[] args) {
		//
		String s1 = "java";
		String s2 = "";
		//
		compute(s1, s2);
//		permute(s1, s2);
	}

	static void compute(String str1, String str2) {

		if (str1.length() <= 1) {
			System.out.println(str1 + str2);
		} else {
			for (int i = 0; i < str1.length(); i++) {
				String left = str1.substring(0, i);
				String middle = str1.substring(i, i + 1);
				String right = str1.substring(i + 1);
				compute(str2 + middle, left + right);
			}
		}

	}

}
