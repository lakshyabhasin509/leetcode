/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node ptr=head;
        
        
        while(ptr!=null){
            if(ptr.child==null)ptr=ptr.next;
            
            else {
                
                if(ptr.next!=null)
                link(ptr.child,ptr.next);
                
            
                ptr.next=ptr.child;
                ptr.child.prev=ptr;
                ptr.child=null;
                    
                }
            }
        
        return head;
    }
    
    public void link(Node child,Node next){
        
        while(child.next!=null){
            child=child.next;
        }
        child.next=next;
        next.prev=child;
    }
}