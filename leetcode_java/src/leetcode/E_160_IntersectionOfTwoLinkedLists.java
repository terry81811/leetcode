package leetcode;

import utils.ListNode;

public class E_160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode longerList;
        ListNode shorterList;
        int aCount = 0;
        int bCount = 0;
        ListNode a =headA;
        ListNode b =headB;
        
        while(a!=null) {
            aCount++;
            a = a.next;
        }

        while(b!=null) {
            bCount++;
            b = b.next;
        }
        longerList = (aCount > bCount) ? headA : headB;
        shorterList = (aCount > bCount) ? headB : headA;
        
        for(int i = 0; i<Math.abs(aCount - bCount); i++) {
            longerList = longerList.next;
        }
        while(longerList != null) {
            if(longerList == shorterList) {
                return longerList;
            }
            longerList = longerList.next;
            shorterList = shorterList.next;
        }
        
        return null;
        
    }
}
