/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode x=head;
        ListNode y=head;
        ListNode z=head;
        while(k>1){
            x=x.next;
            z=z.next;
            k--;
        }
       while(z.next!=null){
            y = y.next;
            z = z.next;
        }
        
        int temp = x.val;
        x.val = y.val;
        y.val = temp;
        
        return head;
    }
}