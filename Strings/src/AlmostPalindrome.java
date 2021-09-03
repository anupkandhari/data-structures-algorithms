
public class AlmostPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean validSubPalindrome(String s, int left, int right) {
		while (left <= right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

	public boolean validPalindrome(String s) {

		if (s.length() <= 2)
			return true;
		int lp = 0, rp = s.length() - 1;

		while (lp <= rp) {
			if (s.charAt(lp) != s.charAt(rp)) {

				return validSubPalindrome(s, lp + 1, rp) || validSubPalindrome(s, lp, rp - 1);

			}

			lp++;
			rp--;
		}
		return true;
	}

}
