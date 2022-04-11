package array;

public class IntegerReversion {
	public static void main(String[] args) {
		
		System.out.println(reverseInt(123344));
		
	}

	private static int reverseInt(int i) {
		int reverse=0;
		
		while (i!=0) {
			reverse=reverse*10+(i%10);
			i=i/10;
		}
		return reverse;
	}

}
