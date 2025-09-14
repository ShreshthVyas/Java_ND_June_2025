package Lecture28;

import Lecture27.DetectCycleLeetcode.ListNode;

public class MeregeTwoSortedList {
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

	public ListNode mergeTwoLists(ListNode a, ListNode b) {
		ListNode head =  new ListNode(0);
		ListNode temp = head;
		while(a!=null && b!=null) {
			if(a.val<b.val) {
				temp.next = a;
				a = a.next;
			}
			else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}
		
		if(a==null) {
			temp.next = b;
		}
		if(b == null) {
			temp.next = a;
		}
		return head.next;
		
	}
}
