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
    public int[] nextLargerNodes(ListNode head) {
        if(head==null)return new int[]{};
        ListNode prev=null,next=null,cur=head;
        int n=0;
        while(cur!=null){

            n++;
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
        Stack<Integer> stack=new Stack<>();
        
        int ans[]=new int[n];
        
        while(head!=null){
            n--;
            int size=stack.size();
            for(int i=0;i<size;i++){    
            
                if(stack.isEmpty()){
                    ans[n]=0;
                }
                else if(stack.peek()>head.val)ans[n]=stack.peek();
                
                else stack.pop();
                
        }
            stack.push(head.val);
            head=head.next;
    }
        return ans;
    
    }}