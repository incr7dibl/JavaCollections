package array;

import java.util.Arrays;

public class ReversingAnArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };

		int lowindex = 0;
		int highIndex = a.length - 1;

		while (lowindex < highIndex) {
			swap(a, lowindex, highIndex);
			lowindex++;
			highIndex--;
		}
		
		System.out.println(Arrays.toString(a));
	}

	private static void swap(int[] a, int lowindex, int highIndex) {

		int temp = a[lowindex];
		a[lowindex] = a[highIndex];
		a[highIndex] = temp;
	}
}
