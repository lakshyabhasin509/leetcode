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
// recursive method

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       
        if(head==null)
            return head;
        Helper(head);
        return head;
    }
    public void Helper(ListNode head){
        if(head.next==null)
            return;
        if(head.val==head.next.val){
            head.next=head.next.next;
            Helper(head);
        }else
        Helper(head.next);
}
}