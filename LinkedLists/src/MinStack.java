import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Stack<Long> stack;
	long minEle;

	public MinStack() {
		stack = new Stack<Long>();
	}

	public void push(long val) {
		if (stack.empty()) {
			stack.push(val);
			minEle = val;
			return;
		}
		if (val >= minEle)
			stack.push(val);
		else {
			stack.push(2 * val - minEle);
			minEle = val;
		}
	}

	public void pop() {

		if (stack.peek() < minEle) {
			// store & return current minEle if pop needs to return the top value
			minEle = 2 * minEle - stack.pop();
		} else
			stack.pop();
	}

	public long top() {
		if (stack.peek() < minEle) {
			return minEle;
		} else
			return stack.peek();
	}

	public long getMin() {
		return minEle;
	}

}
