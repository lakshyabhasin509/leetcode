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
    int i;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       i=0;
        TreeNode node=solve(preorder,inorder,0,inorder.length-1);
        return node;
    }
    TreeNode solve(int[] preorder, int[] inorder,int start,int end){
        if(i>=preorder.length || start>end)return null;
        
        
        int element=preorder[i++];
        TreeNode node=new TreeNode(element);
        int p=search(inorder,element);
        if(p==-1)return null;
        node.left=solve(preorder,inorder,start,p-1);
        node.right=solve(preorder,inorder,p+1,end);
        return node;
    }
    int search(int[]inorder ,int key){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==key)return i;
        }
        return -1;
    }
}