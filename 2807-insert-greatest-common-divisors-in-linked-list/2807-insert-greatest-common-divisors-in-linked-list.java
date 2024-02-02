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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            if (prev != null) {
                int gcd = findGCD(prev.val, curr.val);
                prev.next = new ListNode(gcd, curr);
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
    public static int findGCD(int a, int b)  {  
        while(b != 0)  {  
        if(a > b){  
        a = a - b;  
        }  
        else{  
        b = b - a;  
        }  
        }  
        return a;  
    }  
}