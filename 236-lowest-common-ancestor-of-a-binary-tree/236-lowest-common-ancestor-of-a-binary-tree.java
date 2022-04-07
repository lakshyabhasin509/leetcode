/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode ans;
    
    Solution(){
        this.ans=null;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        search(root,p,q);
        return ans;
    }
    public boolean search(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)return false;
        
       
        int left = search(root.left, p, q) ? 1 : 0;

        // Right Recursion
        int right = this.search(root.right, p, q) ? 1 : 0;

        // If the current node is one of p or q
        int mid = (root == p || root == q) ? 1 : 0;


        // If any two of the flags left, right or mid become True
        if (mid + left + right >= 2) {
            this.ans = root;
        }

        // Return true if any one of the three bool values is True.
        return (mid + left + right > 0);
    }
}