import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class NumberConcatenator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String largestNumber(int[] nums) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < nums.length; i++) {

			int key = nums[i];
			int j = i;

			while (j > 0 && positionalComparison(nums[j - 1], key)) {
				nums[j] = nums[j - 1];
				j--;
			}
			nums[j] = key;
		}
		for (int i = 0; i < nums.length; i++) {
			sb.append(Integer.valueOf(nums[i]));
		}
		if (sb.charAt(0) == '0')
			return "0";
		return sb.toString();
	}

	private boolean positionalComparison(int a, int b) { // is a less than b

		if (a == b)
			return false;
		CharacterIterator it1 = new StringCharacterIterator(String.valueOf(a));
		CharacterIterator it2 = new StringCharacterIterator(String.valueOf(b));
		while (true) {
			if (it1.current() > it2.current()) {
				return false;
			} else if (it1.current() < it2.current()) {
				return true;
			}
			it1.next();
			it2.next();

			if (it1.current() == CharacterIterator.DONE && it2.current() == CharacterIterator.DONE) {
				return false;
			}
			if (it1.current() == CharacterIterator.DONE)
				it1.first();
			if (it2.current() == CharacterIterator.DONE)
				it2.first();
		}
	}

}
