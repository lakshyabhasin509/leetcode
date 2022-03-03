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
    public ListNode reverseList(ListNode head) {
    if(head==null)return head;
    return helper(head,null);
       
    }
    ListNode helper(ListNode head,ListNode p){
       if(head==null)return p;
        ListNode ptr=head.next;
        head.next=p;
        return helper(ptr,head);
    }
       
    
}