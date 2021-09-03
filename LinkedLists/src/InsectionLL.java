
public class InsectionLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode getIntersectionNode(ListNode head1, ListNode head2) {

		ListNode currA = head1;
		ListNode currB = head2;
		int lenA = 0;
		int lenB = 0;
		while (currA != null) {
			lenA++;
			currA = currA.next;
		}
		while (currB != null) {
			lenB++;
			currB = currB.next;
		}

		int diff = Math.abs(lenA - lenB);
		currA = head1;
		currB = head2;
		if (lenA > lenB) {
			for (int i = 0; i < diff; i++) {
				currA = currA.next;
			}
		}

		else if (lenA < lenB)
			for (int i = 0; i < diff; i++) {
				currB = currB.next;
				;
			}

		while (currA != currB) {
			currA = currA.next;
			currB = currB.next;
		}
		return currB;
	}

}
