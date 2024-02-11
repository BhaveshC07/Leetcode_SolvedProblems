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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode curr=head;
        if(curr==null){
            return head;
        }
        while(curr!=null){
            count++;
            curr=curr.next;
        }
       if(count==n){
           ListNode newNode=head.next;
           head=null;
           head=newNode;
           return head;
       }
        int index=count-n;
        curr=head;
        while(curr!=null){
            index--;
            if(index==0){
                break;
            }
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
        
    }
}