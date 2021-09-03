
public class AddNumLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode curr1, curr2, sumcurr;
		int carry = (l1.val + l2.val) / 10;
		ListNode sumHead = new ListNode((l1.val + l2.val) % 10);
		curr1 = l1.next;
		curr2 = l2.next;
		sumcurr = sumHead;
		while (curr1 != null || curr2 != null) {
			int x = (curr1 != null) ? curr1.val : 0;
			int y = (curr2 != null) ? curr2.val : 0;
			int sum = x + y + carry;
			carry = sum / 10;
			sumcurr.next = new ListNode(sum % 10);
			sumcurr = sumcurr.next;
			if (curr1 != null)
				curr1 = curr1.next;
			if (curr2 != null)
				curr2 = curr2.next;
		}
		if (carry != 0) {
			sumcurr.next = new ListNode(carry);
		}
		return sumHead;
	}

}
