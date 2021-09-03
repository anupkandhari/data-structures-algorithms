package _1d_arrays;

public class MinRotatedSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMin(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int start = 0;
		int end = nums.length - 1;
		if (nums[end] > nums[0]) {
			return nums[0];
		}
		while (end >= start) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > nums[mid + 1])
				return nums[mid + 1];
			if (nums[mid] < nums[mid - 1])
				return nums[mid];
			if (nums[mid] > nums[0])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return Integer.MIN_VALUE;
	}

}
