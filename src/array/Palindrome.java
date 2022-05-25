package array;

public class Palindrome {
	public static void main(String[] arg) {
		System.out.println(isPalindrome("aasaa".toCharArray()));
	
	}
	
	private static boolean isPalindrome(char[] charArray) {
		int low = 0;
		int high = charArray.length - 1;
		while (low <= high) {
			if (charArray[low] != charArray[high]) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
	
}
