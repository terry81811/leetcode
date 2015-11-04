package leetcode;

import utils.ListNode;

public class E_203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.next == null && head.val == val) return null;
        
        while(head!=null && head.val==val) {
            head=head.next;
        }
        
        ListNode prev = head;
        ListNode cur = head;
        while(cur != null) {
            if(cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
        
    }
    
    //smart recursive method
    public ListNode removeElements2(ListNode head, int val) {

        if(head==null){
        	return null;
        }else if(head.val==val){
        	return removeElements(head.next,val);
        }
        head.next=removeElements(head.next,val);
        return head;
    }

    //smart dummy way, use just 1 pointer
    public ListNode removeElements3(ListNode head, int val) {
        if (head == null) return head;

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return dummy.next;
    }
}
