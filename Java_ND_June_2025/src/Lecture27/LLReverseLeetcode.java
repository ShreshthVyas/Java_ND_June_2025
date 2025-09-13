package Lecture27;

import Lecture27.ReverseLLLeetcodeStack.ListNode;

public class LLReverseLeetcode {
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
	        return rec(head,null);
	 }
	private ListNode rec(ListNode curr, ListNode prev) {
		// TODO Auto-generated method stub
		if(curr ==null) {
			return prev;
		}
		ListNode temp = rec(curr.next, curr);
		curr.next = prev;
		return temp;
	}
}
