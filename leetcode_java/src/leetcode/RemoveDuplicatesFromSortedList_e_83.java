package leetcode;

import utils.ListNode;

public class RemoveDuplicatesFromSortedList_e_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode cur = head.next;
        ListNode prev = head;
        while(cur != null) {
            if(cur.val == prev.val) {
                cur = cur.next;
                prev.next = cur;
            }else {
                prev.next = cur;
                prev = prev.next;
            }
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        ListNode tmp = head;
        while(tmp != null) {
            if(tmp.next != null && tmp.next.val == tmp.val)
                tmp.next = tmp.next.next;
            else
                tmp = tmp.next;
        }
        return head;
    }

}
