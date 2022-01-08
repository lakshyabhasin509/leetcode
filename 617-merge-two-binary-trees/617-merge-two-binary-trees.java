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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root;
       if(root1==null && root2==null)
           return null;
        int v1 =(root1!=null)?root1.val:0;
        int v2=(root2!=null)?root2.val:0;
        root =new TreeNode(v1+v2);
        
       
        root.left=mergeTrees((root1!=null)?root1.left:null,(root2!=null)?root2.left:null);
        root.right=mergeTrees((root1!=null)?root1.right:null,(root2!=null)?root2.right:null);
        
        
        
        return root;
    }
    
}