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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int count =0;
        if(head==null || head.next==null)return head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        ListNode A1=null,A2=null;
        for(int i=1;temp!=null&&i<=count;i++){
            if(i==k){
                A1=temp;
            }
           if(i==(count-(k-1)))
            {
                A2=temp;
            }
            temp=temp.next;
        }
        
        int t=A1.val;
        A1.val=A2.val;
        A2.val=t;
        return head;
    }
}
