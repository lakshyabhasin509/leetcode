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
    public ListNode mergeNodes(ListNode head) {
      ListNode cur=head.next;
        int temp=0;
       ListNode prev=head;
        
        while(cur!=null){
            temp+=cur.val;
            
            
            if(cur.val==0){
                cur.val=temp;
                prev.next=cur;
                temp=0;
                prev=cur;
               
            }
            cur=cur.next;
        }
        return head.next;
    }
}