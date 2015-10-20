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
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        if (lists.size()==0) return NULL;
        if (lists.size()==1) return lists[0];
        if (lists.size()==2) return merge2Lists(lists[0],lists[1]);
        vector<ListNode*> vec1(lists.begin(),lists.begin()+lists.size()/2);
        vector<ListNode*> vec2(lists.begin()+lists.size()/2,lists.end());
        return merge2Lists(mergeKLists(vec1),mergeKLists(vec2));
        
    }
    ListNode* merge2Lists(ListNode* l1, ListNode* l2) {
        if (!l1) return l2;
        if (!l2) return l1;
        ListNode* node=(l1->val < l2->val)? l1 : l2;
        ListNode* head=node;
        ListNode* opp=(l1->val < l2->val)? l2 : l1;
        while(true) {
            ListNode* temp = node->next;
            if (!temp) {
                node->next = opp;
                return head;
            }
            else if ( temp->val > opp->val) {
                node->next = opp;
                opp = temp;
            }
            node = node->next;
        }
        return head;
    }
};