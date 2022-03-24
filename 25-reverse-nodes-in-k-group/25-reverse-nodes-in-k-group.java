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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null)return head;
        
        ListNode cur=head;
        ListNode prev=null;
        int count=0;
        ListNode ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            count++;
        }
        
        
        while(true){
            ListNode last=prev;
            ListNode newEnd=cur;
            
            ListNode next=cur.next;
            
            for(int i=0;cur!=null&&i<k;i++){
                count--;
                cur.next=prev;
                prev=cur;
                cur=next;
                if(next!=null)next=next.next;
                
            }
            
            
            if(last!=null){
                last.next=prev;
            }
            else head=prev;
        newEnd.next=cur;
              prev=newEnd;
            
            if(count<k||cur==null)break;
           
        }
        
        return head;
    }
}