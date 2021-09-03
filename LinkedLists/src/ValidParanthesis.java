import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				stack.push(s.charAt(i));
			else if (stack.empty() || complement(s.charAt(i)) != stack.pop())
				return false;
		}
		return stack.empty();
	}

	private char complement(char c) {
		if (c == ')')
			return '(';
		if (c == ']')
			return '[';
		if (c == '}')
			return '{';
		return '0';

	}

}
