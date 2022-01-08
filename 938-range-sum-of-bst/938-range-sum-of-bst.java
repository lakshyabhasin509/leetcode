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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int x,y;
    if(root!=null){
        x=rangeSumBST(root.left,low,high);
        y=rangeSumBST(root.right,low,high);
        
        if(root.val>=low && root.val<=high)
            return x+y+root.val;
        else return x+y;
        
    }
        return 0;
    }
    
}