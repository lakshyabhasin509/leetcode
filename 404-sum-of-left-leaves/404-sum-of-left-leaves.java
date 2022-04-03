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
     public int sumOfLeftLeaves(TreeNode root) {
    // if(root.left==null && root.right==null)return 0;
         return sum(root,0);
        }
    public int sum(TreeNode root,int l) {

        if(root.left==null&&root.right==null){
            return l*root.val;
           
        }
       
        int lVal=0,rVal=0;
        if(root.left!=null)
        lVal=sum(root.left,1);
        if(root.right!=null)
        rVal=sum(root.right,0);
       return lVal+rVal;
        }
}