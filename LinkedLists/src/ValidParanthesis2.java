import java.util.Stack;

public class ValidParanthesis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String minRemoveToMakeValid(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		String[] result = s.split("");
		for (int i = 0; i < result.length; i++) {
			char ch = s.charAt(i);
			if (ch == '(')
				stack.push(i);
			else if (ch == ')' && !stack.empty())
				stack.pop();
			else if (ch == ')')
				result[i] = "";
		}
		while (!stack.empty()) {
			result[stack.pop()] = "";
		}
		return String.join("", result);
	}

}
