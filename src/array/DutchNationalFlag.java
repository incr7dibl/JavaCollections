package array;

import java.util.Arrays;

public class DutchNationalFlag {

	int[] nums = { 2, 1, 1, 1, 0, 1, 2, 2, 0, 0, 1, 1, 2, 0, 1 };

	public static void main(String[] args) {
		DutchNationalFlag dutch = new DutchNationalFlag();
		dutch.solve();
	}

	public void solve() {
		showArray();
		/*
		 * i denotes the cluster of 0, j denotes the cluster of 1 and k denotes the
		 * cluster of 2 i and j start with index of first element and k starts with
		 * index of last element
		 */
		int i = 0;
		int j = 0;
		int pivot = 1;
		int k = nums.length - 1;
		// we run the loop till j and k don't cross each other
		while (j <= k) {
			/*
			 * when number at j is smaller than pivot then it should be swapped with cluster
			 * of 0 and i and j should be incremented since elements till index i and j are
			 * assumed to be sorted with respect to their cluster
			 */
			if (nums[j] < pivot) {
				swap(i, j);
				i++;
				j++;
				/*
				 * When number at j is greater than pivot element then elements at index j and k
				 * should be swapped and index should be decremented since element at k is
				 * assumed to be sorted with respect to their cluster
				 */
			} else if (nums[j] > pivot) {
				swap(j, k);
				k--;
				/*
				 * When element at j equals to pivot element then we can assume that element is
				 * at correct sorted position and increment index j
				 */
			} else {
				j++;
			}
		}
		showArray();
	}

	private void swap(int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}

	public void showArray() {
		System.out.println(Arrays.toString(nums));
	}
}
