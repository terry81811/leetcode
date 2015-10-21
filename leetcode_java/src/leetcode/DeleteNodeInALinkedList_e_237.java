package leetcode;

import utils.ListNode;

public class DeleteNodeInALinkedList_e_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
