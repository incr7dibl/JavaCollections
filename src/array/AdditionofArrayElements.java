package array;

public class AdditionofArrayElements {

	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6};
		
		int sum=doSum(a);
	System.out.println(sum);
	}

	public static int doSum(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
