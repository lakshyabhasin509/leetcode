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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
        
        ListNode mid=middleNode(head);
         ListNode hf=head;
        ListNode hs=reverse(mid);
        
        
        while(hf!=null && hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if(hf!=null)hf.next=null;
        
    }
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){

        fast=fast.next.next;
        slow=slow.next;
        }
 return slow;   }
    
    public ListNode reverse(ListNode head){
        if(head==null)return head;
        
        ListNode prev=null;
            ListNode cur=head;
        ListNode next=cur.next;
        
        while(cur!=null){
            cur.next=prev;
            prev=cur;
            cur=next;
            if(next!=null){
                next=next.next;
            }
            
        }
        return prev;
    }
}