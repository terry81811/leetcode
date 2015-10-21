package leetcode;

import utils.ListNode;

public class E_206_Reverse_Linked_List {
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
    	E_206_Reverse_Linked_List o = new E_206_Reverse_Linked_List();
    	
    }
}
