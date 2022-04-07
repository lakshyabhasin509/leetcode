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
    int height;
    int sum;
    pair(int h,int s){
        this.height=h;
        this.sum=s;
    }
}
    public int deepestLeavesSum(TreeNode root) {
        pair p=new pair(0,0);
        solve(root,0,p);
        return p.sum;
    
    }
public void solve(TreeNode root,int height,pair p){
    if(root==null)return;
    height++;
    if(root.left==null && root.right==null){
        if(height==p.height){
        p.sum+=root.val;
        }
        else if(height>p.height){
            p.height=height;
            p.sum=root.val;
        }
        return;
    }
    solve(root.left,height,p);
    solve(root.right,height,p);
    
    
}
}

