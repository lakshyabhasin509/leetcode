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
        ListNode ans=new ListNode();
        int temp=0;
        ListNode ansHead=ans;
        
        head=head.next;
        
        while(head!=null){
            temp+=head.val;
            if(head.val==0){
                ListNode t=new ListNode(temp);
                ansHead.next=t;
                ansHead=t;
                temp=0;
            }
            head=head.next;
        }
        return ans.next;
    }
}