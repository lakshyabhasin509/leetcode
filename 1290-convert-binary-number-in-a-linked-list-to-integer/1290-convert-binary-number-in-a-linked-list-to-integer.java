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
    public int getDecimalValue(ListNode head) {

        ListNode tail=head;
        int length=0;
        int ans=0;
        while(tail.next!=  null){
            tail=tail.next;
            length++;
            
        }
        while(head!=null){

            ans=ans+head.val*(int)Math.pow(2,length--);
        head=head.next;}
        return ans;
    }
}