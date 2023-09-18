/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        Node ptr=head;
        Node temp=new Node(-1);
        Node newHead=temp;
        
        HashMap<Node,Node> map=new HashMap<>();
        
        
        while(ptr!=null){
            Node n=new Node(ptr.val);
            map.put(ptr,n);
            temp.next=n;
            temp=n;
            ptr=ptr.next;
            }
        
        ptr=head;
        temp=newHead.next;
        
         while(ptr!=null){
            if(ptr.random==null){
                temp.random=null;
            }
             else{
                 Node ran=map.get(ptr.random);
                 temp.random=ran;
             }
            temp=temp.next;
            ptr=ptr.next;
            }
        
        
        return newHead.next;
        
    }
}