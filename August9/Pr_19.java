class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Pr_19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode res = new ListNode(0);
		res.next = head;
		ListNode slow = res, fast = res;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}

		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return res.next;
	}

}
