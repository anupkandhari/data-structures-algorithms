package _1d_arrays;

public class WaterContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxArea(int[] height) {

		int lp = 0;
		int rp = height.length - 1;

		int max = 0;

		while (lp < rp) {

			int length = Math.min(height[lp], height[rp]);
			int area = (rp - lp) * length;
			max = Math.max(max, area);

			if (height[lp] < height[rp]) {
				lp++;
			} else {
				rp--;
			}
		}
		return max;
	}

}
