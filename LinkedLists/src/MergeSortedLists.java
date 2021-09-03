
public class MergeSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null || l2 == null)
			return (l1 != null) ? l1 : l2;
		ListNode cur = l1.val <= l2.val ? l1 : l2;
		ListNode head = cur, prev = cur;
		if (cur == l1)
			l1 = l1.next;
		else
			l2 = l2.next;
		while (l1 != null && l2 != null) {
			cur = l1.val <= l2.val ? l1 : l2;
			prev.next = cur;
			prev = cur;
			if (cur == l1) {
				l1 = l1.next;
			} else {
				l2 = l2.next;
			}
		}
		if (l1 != null) {
			prev.next = l1;
		}
		if (l2 != null) {
			prev.next = l2;
		}
		return head;
	}

}
