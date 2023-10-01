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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ptr=head;
        ListNode last=null;
        
        for(int i=1;i<left;i++){
            last=ptr;
            ptr=ptr.next;
        }
        
        ListNode newEnd=ptr;
        ListNode next=ptr.next;
        ListNode prev=null;
        
        for(int i=left;i<right;i++){
            prev=ptr;
            ptr=next;
            if(ptr!=null)
            next=ptr.next;
            
            ptr.next=prev;
        }
        newEnd.next=next;
        
        
        if(last!=null)
        last.next=ptr;
        else return ptr;
        
        
        return head;
    }
}