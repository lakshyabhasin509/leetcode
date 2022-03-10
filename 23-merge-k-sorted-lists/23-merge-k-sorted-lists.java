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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<Integer>();
        
        for(ListNode i:lists){
            while(i!=null){
                list.add(i.val);
                i=i.next;
            }  
        
      
        }

            
            Collections.sort(list);
            
            ListNode head=new ListNode();
            ListNode temp=head;
            
            for(int j:list){
                ListNode t=new ListNode(j);
                temp.next=t;
                temp=t;
            }
        return head.next;
           }
    }
