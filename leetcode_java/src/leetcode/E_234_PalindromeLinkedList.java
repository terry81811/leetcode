package leetcode;

import utils.ListNode;

public class E_234_PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		//corner case
		if(head == null || head.next == null) return true;

		//find the middle node
		ListNode mid = this.findMid(head);

		//reverse the second link 
		ListNode midNext = this.reverseList(mid);

		//unlink two links
		mid.next = null;

		ListNode first = head;
		ListNode second = midNext;

		//compare two list
			while(first != null && second != null) {
				if(first.val != second.val) return false;
				first = first.next;
				second = second.next;
			}
			if(first == null && second == null) return true;
			if(first == null && second.next == null) return true;
			return true;
		}

		public ListNode reverseList(ListNode node) {
			ListNode cur = node;
				ListNode prev = null;
				while(cur != null) {
					ListNode temp = cur.next;
					cur.next = prev;
					prev = cur;
					cur = temp;
			}
			return prev;
		}

		public ListNode findMid(ListNode node) {
			ListNode slow = node;
			ListNode fast = node;
			while(fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
}

//fast, slow pointer to find mid
//