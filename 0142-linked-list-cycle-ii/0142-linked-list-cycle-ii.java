/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
            ListNode fast=head;
        ListNode slow=head;
        boolean hasCycle=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow){
                hasCycle=true;
                break;
            }}
        ListNode ptr=head;
        if(hasCycle){
            
            while(ptr!=slow){
                ptr=ptr.next;
                slow=slow.next;
            }return ptr;
           
        }
     else return null;
        
        
        
        
    }
}