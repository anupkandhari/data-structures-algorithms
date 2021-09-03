package _1d_arrays;

public class TrapRain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int trap(int[] height) {

		int lp = 0, rp = height.length - 1, output = 0;

		if (height.length > 2) {
			int maxl = height[0], maxr = height[height.length - 1];

			while (lp < rp) {

				if (maxl <= maxr) {

					if (maxl > height[lp + 1]) {
						output += maxl - height[lp + 1];
					} else {
						maxl = height[lp + 1];
					}
					lp++;
				} else {

					if (maxr > height[rp - 1]) {
						output += maxr - height[rp - 1];
					} else {
						maxr = height[rp - 1];
					}
					rp--;
				}
			}
		}

		return output;
	}

}
