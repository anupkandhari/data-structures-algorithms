package _1d_arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int value = target - nums[i];

			if (map.containsKey(value) && map.get(value) != i) { // one pass Hash
				return new int[] { i, map.get(value) };
			} else {
				map.put(nums[i], i);
			}
//	             for (int j = i+1; j < nums.length; j++) {  // Brute force
//	                 if (nums[j] == value){
//	                     return new int[] { i, j};
//	                 }
//	             }        

		}
		return null;
	}

}
