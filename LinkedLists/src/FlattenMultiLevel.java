
public class FlattenMultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Definition for a Node.
	class Node {
		public int val;
		public Node prev;
		public Node next;
		public Node child;
	};

	public Node flatten(Node head) {
		Node curr = head, right = head, subcurr = null;
		while (curr != null) {
			if (curr.child != null) {
				right = curr.next;
				curr.next = curr.child;
				curr.child.prev = curr;
				curr.child = null;
				subcurr = curr.next;

				while (subcurr.next != null)
					subcurr = subcurr.next;

				subcurr.next = right;
				if (right != null)
					right.prev = subcurr;
			}

			curr = curr.next;

		}
		return head;

	}

}
