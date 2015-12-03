/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int c=0, sum=0;
        ListNode* t1=l1;
        ListNode* t2=l2;
        ListNode* dummy = new ListNode(0);
        ListNode* prev = head;
        // while ( t1 && t2 ) {
        //     sum = t1->val + t2->val +c;
        //     t1 = t1->next;
        //     t2 = t2->next;
        //     c = sum/10;
        //     sum %= 10;
        //     prev->next = new ListNode(sum);
        //     prev = prev->next;
        // }

        while (t1 || t2) {
            if (t1 && t2) {
                sum = t1->val + t2->val + c;
                t1 = t1->next;
                t2 = t2->next;
            }
            else if (t1) {
                sum = t1->val + c;
                t1 = t1->next;
            }
            else {
                sum = t2->val + c;
                t2 = t2->next;
            }
            c = sum/10;
            sum %= 10;
            prev->next = new ListNode(sum);
            prev = prev->next;
            

        }
        if (c>0)
            prev->next = new ListNode(c);
        return dummy->next;
    }
};