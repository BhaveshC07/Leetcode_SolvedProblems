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
    public ListNode oddEvenList(ListNode head) {
        ListNode list1=new ListNode(0);
        ListNode list2=new ListNode(0);
        ListNode l1=list1;
        ListNode l2=list2;
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        for(int i=1;i<=size;i++){
        if(i%2==0){
                l1.next=head;
                l1=l1.next;
            }else{
                l2.next=head;
                l2=l2.next;
            }
            head=head.next;
        }
        l2.next=list1.next;
        l1.next=null;
        return list2.next;
    }
}