package leetcode;

import utils.ListNode;

public class E_21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode head;

        if(c1 == null && c2 == null) return null;
        if(c1 == null) return c2;
        if(c2 == null) return c1;
         
        if(l1.val < l2.val) {
        	head = l1;
            c1 = l1.next;
        }
        else {
        	head = l2;
        	c2 = l2.next;
        }
		ListNode cur = head;
        
        while(c1!=null && c2!=null) {
            if(c1.val < c2.val) {
            	cur.next = c1;
            	c1 = c1.next;
            	cur = cur.next;
            }else {
            	cur.next = c2;
            	c2 = c2.next;
            	cur = cur.next;
            }
        }
        if(c1!=null) {
        	cur.next = c1;
        }else {
        	cur.next = c2;
        }
        
        return head;
    }
}
