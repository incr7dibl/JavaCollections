package array;

import java.util.Arrays;

public class AnagramProblem {
	public static void main(String[] arg) {

		System.out.println(isAnagram("restful".toCharArray(), "fluster".toCharArray()));

	}

	private static boolean isAnagram(char[] charArray1, char[] charArray2) {

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (charArray1.length != charArray2.length) {
			return false;
		}
		for (int i = 0; i < charArray2.length; i++) {
			if (charArray1[i] != charArray2[i]) {
				return false;
			}
		}
		return true;
	}

}
