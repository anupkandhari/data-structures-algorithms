package _1d_arrays;

public class ArrayNesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int arrayNesting(int[] nums) {
		int max = 0, start, count;
		boolean[] visited = new boolean[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (!visited[i]) {
				start = nums[nums[i]];
				count = 1;
				visited[start] = true;
				while (start != nums[i]) {
					start = nums[start];
					count++;
					visited[start] = true;
				}
				max = Math.max(max, count);
			}
		}
		return max;
	}

}
