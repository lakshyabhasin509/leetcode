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
        if(left==right)return head;
        
        ListNode prev=null;
        ListNode cur=head;
        
        for(int i=0;cur!=null&&i<left-1;i++){
            prev=cur;
            cur=cur.next;
        }
        
        ListNode firstJunction=prev;
        ListNode lastJunction=cur;
        ListNode next=cur.next;
        
        
        for(int i=0;cur!=null&&i<right-left+1;i++){
            cur.next=prev;
            prev=cur;
            cur=next;
            if(next!=null){
                next=next.next;
            }
        }
        lastJunction.next=cur;
        if(firstJunction!=null)
        firstJunction.next=prev;
        else head=prev;
        
        
        return head;
    }
}