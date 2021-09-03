
public class ReverseBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseBetween(ListNode head, int left, int right) {

		if (left == right)
			return head;
		ListNode curr = head;
		ListNode start = head, llink = head, next = head, list = null;
		int pos = 0;
		while (curr != null) {
			pos++;
			if (pos == left) {
				start = curr;
				break;
			}
			llink = curr;
			curr = curr.next;
		}

		while (pos < right && curr != null) {
			pos++;
			next = curr.next;
			curr.next = list;
			list = curr;
			curr = next;
		}

		start.next = curr.next;
		curr.next = list;

		if (left != 1) {
			llink.next = curr;
			return head;
		} else
			return curr;
	}
}
