
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(String s) {

		if (s.length() <= 1)
			return true;
		else {
			int lp = 0, rp = s.length() - 1;
			while (lp <= rp) {
				while (lp < s.length() - 1 && !Character.isLetterOrDigit(s.charAt(lp))) {
					lp++;
				}

				while (rp > 0 && !Character.isLetterOrDigit(s.charAt(rp))) {
					rp--;
				}

				if (lp <= rp && Character.toLowerCase(s.charAt(lp)) != Character.toLowerCase(s.charAt(rp)))
					return false;
				lp++;
				rp--;
			}
			return true;
		}
	}

}
