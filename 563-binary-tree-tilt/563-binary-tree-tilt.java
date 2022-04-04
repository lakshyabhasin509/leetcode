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
    private class pair{
        int sum;
        int difference;
        pair(int s,int d){
            sum=s;
            difference=d;
        }
    }
    public int findTilt(TreeNode root) {
        if(root==null)return 0;
       pair ans=find(root);
        return ans.difference;
       
    }
    
    public pair find(TreeNode root){
        if(root==null){
            return new pair(0,0);
        }
        
        pair left=find(root.left);
        pair right=find(root.right);
        
        pair ret=new pair(left.sum+right.sum+root.val,left.difference+right.difference+Math.abs(left.sum-right.sum));
        return ret;
    }
}