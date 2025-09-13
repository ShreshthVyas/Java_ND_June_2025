package Lecture27;

import Lecture27.LLReverseLeetcode.ListNode;

public class LLReverseIterrative {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode reverseList(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode curr = head;
		ListNode prev = null;
		
		while(curr!=null) {
			ListNode temp = curr.next;
			curr.next = prev;//reverse
			prev = curr;
			curr = temp;
		}
		
		return prev;
	}

}
