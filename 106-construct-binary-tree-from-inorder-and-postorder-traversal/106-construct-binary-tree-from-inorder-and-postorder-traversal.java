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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        i=postorder.length-1;
        TreeNode node=solve(postorder,inorder,0,inorder.length-1);
        return node;
    }
     
    TreeNode solve(int[] postorder, int[] inorder,int start,int end){
        if(i<0 || start>end)return null;
        
        
        int element=postorder[i--];
        TreeNode node=new TreeNode(element);
        int p=search(inorder,element);
        
        
        node.right=solve(postorder,inorder,p+1,end);
        node.left=solve(postorder,inorder,start,p-1);
        return node;
    }
    int search(int[]inorder ,int key){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==key)return i;
        }
        return -1;
    }
}