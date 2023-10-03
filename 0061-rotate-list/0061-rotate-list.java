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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k<=0)return head;
        
        ListNode ptr=head;
        int count=0;
        
        while(ptr!=null){
            ptr=ptr.next;
            count++;
        }
        
        ListNode prev=null;
        ptr=head;
        k=k%count;
        
        if(k==0)return head;
        for(int i=1;i<=count-k;i++){
            prev=ptr;
            ptr=ptr.next;
        }
        prev.next=null;
        ListNode newHead=ptr;
        
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=head;
        
        
        return newHead;
        
        
        
    }
}