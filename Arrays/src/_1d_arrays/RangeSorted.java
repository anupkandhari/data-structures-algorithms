package _1d_arrays;

public class RangeSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] searchRange(int[] nums, int target) {

		if (nums.length == 0)
			return new int[] { -1, -1 };
		int left = leftMostPos(nums, target);
		if (left == -1)
			return new int[] { -1, -1 };
		return new int[] { left, rightMostPos(nums, target) };

	}

	private int leftMostPos(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				if (mid == 0)
					return 0;
				if (nums[mid - 1] < target)
					return mid;
				end = mid - 1;
			} else if (nums[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

	private int rightMostPos(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				if (mid == nums.length - 1)
					return nums.length - 1;
				if (nums[mid + 1] > target)
					return mid;
				start = mid + 1;
			} else if (nums[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

}
