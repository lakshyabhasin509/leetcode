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
    public ListNode sortList(ListNode head) {
         
        if(head==null || head.next==null)return head;
        ListNode mid =getMid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
return merge(left,right);
    }
    
    
    public ListNode getMid(ListNode head) {
        ListNode midprev=null;
        
        while(head!=null&&head.next!=null){
            
            if(midprev==null)midprev=head;
            else midprev=midprev.next;
            
            head=head.next.next;
            
            
        }
        
        ListNode mid=midprev.next;
        midprev.next=null;
        return mid;
    }
           public ListNode merge(ListNode list1, ListNode list2){
       
                 if(list1==null)return list2;
        if(list2==null)return list1;
               
               ListNode list=new ListNode();
        ListNode head=list;
        while(list1 !=null && list2 != null){
            if(list1.val<=list2.val){
                list.next=list1;
                list1=list1.next;
                list=list.next;
            }
            else{
                 list.next=list2;
                list2=list2.next;
                list=list.next;
            }
        }
        list.next=list1!=null?list1:list2;
        return head.next;
        
    } 
}


