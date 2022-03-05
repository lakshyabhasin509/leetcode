/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        int countA=0;
        while(temp!=null){
            temp=temp.next;
            countA++;
        }
        int countB=0;
        temp=headB;
         while(temp!=null){
            temp=temp.next;
            countB++;
        }
        
        while(headA!=headB){
            if(countA>countB){
                countA--;
                headA=headA.next;
            }
            else if(countB>countA){
                countB--;
                headB=headB.next;
            }
            else{
                headA=headA.next;
                headB=headB.next;
                
            }
        }
             return headB;
        
       
    
}}