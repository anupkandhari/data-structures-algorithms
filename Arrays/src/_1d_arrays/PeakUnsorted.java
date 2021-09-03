package _1d_arrays;

public class PeakUnsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findPeak(int[] nums, int start, int end) {
		int mid = start + (end - start) / 2;
		if ((mid == 0 || nums[mid - 1] <= nums[mid]) && 
				(mid == nums.length - 1 || nums[mid + 1] <= nums[mid]))
			return mid;

		else if (mid > 0 && nums[mid - 1] > nums[mid])
			return findPeak(nums, start, mid - 1);

		else
			return findPeak(nums, mid + 1, end);
	}

}
