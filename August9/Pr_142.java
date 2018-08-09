import java.util.HashSet;
import java.util.Set;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Pr_142 {

	// Approach 1 (Using Set)
	// Add every element to set
	// If the element is already present then its the start of cycle
	public ListNode detectCycle(ListNode head) {
		Set<ListNode> values = new HashSet<ListNode>();
		while (head != null) {
			if (values.contains(head))
				return head;
			values.add(head);
			head = head.next;
		}
		return null;
	}

	public ListNode detectCycle2(ListNode head) {
		if (head == null)
			return head;
		ListNode slow = head, fast = head;
		while (1 == 1) {
			if (slow != null)
				slow = slow.next;
			else
				return null;
			if (fast.next != null)
				fast = fast.next.next;
			else
				return null;
			if (slow == null || fast == null)
				return null;

			if (slow == fast)
				break;
		}

		ListNode ptr1 = head, ptr2 = slow;
		while (ptr1 != ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return ptr1;
	}

	// Approach 3
	// Get the intersection and check where it meets //To find loop and entry point
	// for the loop
	public ListNode Intersection(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return slow;
		}
		return null;
	}

	public ListNode detectCycle3(ListNode head) {
		ListNode intersection = Intersection(head);
		if (intersection == null)
			return null;
		ListNode ptr1 = head, ptr2 = intersection;
		while (ptr1 != ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return ptr1;
	}

}
