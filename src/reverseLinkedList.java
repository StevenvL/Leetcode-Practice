import java.util.Stack;

public class reverseLinkedList {
	public static ListNode reverseList(ListNode head) {
		ListNode newHead;
		ListNode trailingNode = head;
		
		Stack<ListNode> temp = new Stack<>();
		while(trailingNode != null) {
			temp.push(trailingNode);
			trailingNode = trailingNode.next;
		}		
		
		
		newHead = new ListNode(temp.pop().val);
		ListNode result = newHead;
		while(temp.isEmpty() == false) {
			ListNode t = new ListNode(temp.pop().val);
			newHead.next = t;
			newHead = newHead.next;
		}
		
		return result;
	}

	public static String printOut(ListNode head) {
		String res = "";
		while(head != null) {
			res += head.val + " ";
			head = head.next;
		}
		return res;
	}
	
	public static void main (String [] args) {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(77);
		head.next = n1;
		head.next.next = n2;
		ListNode res = reverseList(head);
		//System.out.println(res);
		System.out.println(printOut(res));
		
	}
}
