
public class RemoveNNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode right = temp;
		ListNode left = temp;
		int i = 1;
		while (i <= n + 1) {
			right = right.next;
			i++;
		}
		while (right != null) {
			right = right.next;
			left = left.next;
		}
		left.next = left.next.next;
		return temp.next;
	}

}
