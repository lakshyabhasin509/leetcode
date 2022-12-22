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
    public int goodNodes(TreeNode root) {
        if(root==null)return 0;
        findGoodNodes(root,root.val);
        return count;
    }
    int count=0;
    public void findGoodNodes(TreeNode root,int val){
        if(root==null)return;
        if(root.val>=val)count++;
        
        
        findGoodNodes(root.left,Math.max(root.val,val));
        findGoodNodes(root.right,Math.max(root.val,val));
        
    }
}