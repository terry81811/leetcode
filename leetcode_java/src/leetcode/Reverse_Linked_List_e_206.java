package leetcode;

import utils.ListNode;

public class Reverse_Linked_List_e_206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = null;
        
        while(head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }       
    
    public static void main(String[] args) {
    	Reverse_Linked_List_e_206 o = new Reverse_Linked_List_e_206();
    	
    }
}
