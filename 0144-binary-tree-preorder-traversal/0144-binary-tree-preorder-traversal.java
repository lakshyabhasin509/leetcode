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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        if (root==null)return ans;
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            TreeNode left=node.left;
            TreeNode right=node.right;
             if(right!=null){
                stack.push(right);
            }
            if(left!=null){
                stack.push(left);
            }
            
            ans.add(node.val);
           
        }
        
        return ans;
    }
}