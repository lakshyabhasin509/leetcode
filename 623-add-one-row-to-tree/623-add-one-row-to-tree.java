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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null)return null;
        if(depth==1)return new TreeNode(val,root,null);
        if(depth==2){
            TreeNode left=root.left;
            TreeNode right=root.right;
            root.right=new TreeNode(val,null,right);
            root.left=new TreeNode(val,left,null);
        }
        
        addOneRow(root.left,val,depth-1);
        addOneRow(root.right,val,depth-1);
        
        return root;
        
    }
}