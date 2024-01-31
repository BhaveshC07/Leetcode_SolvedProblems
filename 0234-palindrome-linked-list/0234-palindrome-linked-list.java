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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode temp=findMid(head);
        ListNode prev=null;
        ListNode forw=null;
        while(temp!=null){
            forw=temp.next;
            temp.next=prev;
            prev=temp;
            temp=forw;
        }
        
        ListNode right=prev;
        ListNode left=head;
        
        while(right!=null){
            if(right.val!=left.val){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
    public ListNode findMid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }    
}