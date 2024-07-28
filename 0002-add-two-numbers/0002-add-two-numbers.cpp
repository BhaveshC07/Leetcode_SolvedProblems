/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
private:

    void insertAtTail(ListNode* &head, ListNode*&tail, int data){
            ListNode* temp = new ListNode(data);

            if(head == NULL){
                head = temp;
                tail = temp;
            }
            else
            {
            tail -> next = temp;
            tail = tail -> next;
            }
    }
    ListNode* solve(ListNode* l1, ListNode* l2){
        int carry = 0;
        ListNode* ansHead = NULL;
        ListNode* ansTail = NULL;
        while(l1!= NULL || l2 != NULL || carry != 0){
            int val1  = 0;
            int val2 = 0;
            if(l1 != NULL){
                val1 = l1 -> val;
                l1 = l1 -> next;
            }
            if(l2 != NULL){
                val2 = l2 -> val;
                l2 = l2 -> next;
            }
            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            insertAtTail(ansHead, ansTail, digit);
             carry = sum / 10;
        }
        return ansHead;
    }
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* ans  = solve(l1, l2);
        return ans;
        
    }
};