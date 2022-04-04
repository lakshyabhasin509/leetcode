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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int leftHeight=0;
        int rightHeight=0;
        TreeNode cur=root;
        while(cur!=null){

        leftHeight++;
            cur=cur.left;
        }
        cur=root;
        while(cur!=null){

        rightHeight++;
            cur=cur.right;
        }
        if(leftHeight==rightHeight)return (int)(Math.pow(2,rightHeight)-1);
      
        int left=countNodes(root.left);
        int right=countNodes(root.right);
        
        return left+right+1;
    }
}