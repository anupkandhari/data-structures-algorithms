import java.util.HashMap;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLongestSubstring(String s) {
		int longest = 0, max = 0, index = 0;
		if (s.length() == 0)
			return 0;
		if (s.length() == 1)
			return 1;
		else {
			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (map.containsKey(ch) && map.get(ch) >= index) {
					index = map.get(ch);
					max = Math.max(longest, max);
					map.put(ch, i);
					longest = i - index;

				} else {
					map.put(ch, i);
					longest++;
				}

			}
			return Math.max(longest, max);
		}

	}

}
