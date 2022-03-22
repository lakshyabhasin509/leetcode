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
    public ListNode partition(ListNode head, int x) {
        ListNode prev=null;
        ListNode ptr=head;
      if(head==null || head.next==null)return head;
        
        while(ptr!=null){
            if(ptr.val<x)
            {
                prev=ptr;
                ptr=ptr.next;
            }
            else if(ptr.next!=null && ptr.next.val>=x){
               ptr=ptr.next;
                
            }
            else {
                if(ptr.next==null)ptr=null;
                else if(prev==null && ptr.next!=null){
                    ListNode temp=ptr.next.next;
                ptr.next.next=head;
                    head=ptr.next;
                    ptr.next=temp;
                    prev=head;
                    
                    
                }
                
                
                else {
                     ListNode temp=ptr.next.next;
                ptr.next.next=prev.next;
                    prev.next=ptr.next;
                    ptr.next=temp;
                    prev=prev.next;
                }
            }
        }
        return head;
    }
}