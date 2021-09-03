
public class BackspaceCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public BackspaceCompare() {
		// TODO Auto-generated constructor stub
	}

	public boolean backspaceCompare(String s, String t) {
		int sp = s.length() - 1;
		int tp = t.length() - 1;

		while (sp >= 0 || tp >= 0) {
			if (sp >= 0 && s.charAt(sp) == '#') {
				int bk = 2;
				while (bk > 0) {
					sp--;
					bk--;

					if (sp >= 0 && s.charAt(sp) == '#')
						bk += 2;
				}
			}

			if (tp >= 0 && t.charAt(tp) == '#') {
				int bk = 2;
				while (bk > 0) {
					tp--;
					bk--;

					if (tp >= 0 && t.charAt(tp) == '#')
						bk += 2;
				}
			}

			if (sp >= 0 && tp >= 0) {
				if (s.charAt(sp) != t.charAt(tp))
					return false;
				sp--;
				tp--;
			} else if (sp < 0 && tp < 0)
				return true;
			else
				return false;

		}
		return true;
	}

}
