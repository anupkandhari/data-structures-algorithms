import java.util.Stack;

public class QueueUsingStacks {
	public static void main(String[] args) {
		// TODO
	}

	Stack<Integer> left;
	Stack<Integer> right;

	/** Initialize your data structure here. */
    public QueueUsingStacks() {
        this.left = new Stack<Integer>();
        this.right = new Stack<Integer>();
    }

	/** Push element x to the back of queue. */
	public void push(int x) {
		left.push(x);

	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		if (right.empty()) {
			while (!left.empty()) {
				right.push(left.pop());
			}
		}
		return right.pop();
	}

	/** Get the front element. */
	public int peek() {
		if (right.empty()) {
			while (!left.empty()) {
				right.push(left.pop());
			}
		}
		return right.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return left.empty() && right.empty();
	}
}
