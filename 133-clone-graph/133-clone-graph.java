/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        HashMap<Integer,Node> vis=new HashMap<>();
        return dfs(node,vis);
        
        
    }
    Node dfs(Node node,HashMap<Integer,Node> vis)
{
    Node n=new Node(node.val);
    
    vis.put(node.val,n);
    for(Node i:node.neighbors){
        if(!vis.containsKey(i.val)){
            Node child=dfs(i,vis);  
            n.neighbors.add(child);
        }
        else{
           Node ne= vis.get(i.val);
            n.neighbors.add(ne); 
        }
        
    }
    return n;
    
        
}
}