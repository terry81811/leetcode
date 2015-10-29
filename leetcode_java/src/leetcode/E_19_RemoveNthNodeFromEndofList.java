package leetcode;

import utils.ListNode;

public class E_19_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;   // no node
        if(head.next == null) return null;  //only one node, remove the node;
        
        int count = 0;
        ListNode cur = head;
        ListNode res = head;
        while(count<n) {
            cur=cur.next;
            count++;
        }
        
        if(cur == null) {
            head = head.next;
            return head;
        }
        
        while(cur!=null) {
            cur=cur.next;
            if(cur == null) {
                res.next = res.next.next;
                return head;
            }
            res=res.next;
        }

        return head;
    }
}
