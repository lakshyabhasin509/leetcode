/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)return new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
      
        
        do{
            if(root!=null){
            stack.push(root);
            root=root.left;}
           else{
              root=stack.pop();
               list.add(root.val);
               root=root.right;
           }
        }while(!stack.isEmpty() || root!=null);
        return list;
}}