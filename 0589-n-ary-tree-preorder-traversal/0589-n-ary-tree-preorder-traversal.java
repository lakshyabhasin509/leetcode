/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        
        helper(root,list);
        
        return list;
    }
    void helper(Node root,ArrayList<Integer> list){
        if (root==null)return;
        
        list.add(root.val);
        
        for(Node node:root.children){
            helper(node,list);
        }
    }
    
}