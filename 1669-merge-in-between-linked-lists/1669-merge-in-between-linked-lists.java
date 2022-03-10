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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tail2=list2;
        while(tail2.next!=null)tail2=tail2.next;
        ListNode first=list1;
        ListNode second=list1;
        for(int i=1;first!=null&&i<a;i++){
            first=first.next;
        }
        for(int i=0;second!=null&&i<b;i++){
            second=second.next;
        }
        first.next=list2;
        tail2.next=second.next;
        second.next=null;
        
        
        
        return list1;
        
    }
}