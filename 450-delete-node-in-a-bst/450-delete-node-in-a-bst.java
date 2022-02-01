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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode cur=root;
        if(cur == null)
            return null;
        if(root.val==key)
            return helper(root);
        while(root!=null){

        if(root.val>key)
        {
            if(root.left!=null && root.left.val==key){
                root.left=helper(root.left);
                break;
            }
            else{
                root=root.left;
            }
        }
            else{
                if(root.right!=null && root.right.val==key){

                root.right=helper(root.right);
                break;
                }
                else root=root.right;
                
            }
        }
        return cur;
        
        
    }
    
    public TreeNode helper(TreeNode root){
     if(root.right==null)
         return root.left;
        else if(root.left==null)
            return root.right;
        else {
            TreeNode Rightchild=root.right;
            TreeNode lastRight=findlastRight(root.left);
            lastRight.right=Rightchild;
            return root.left;
        }
    }
    public TreeNode findlastRight(TreeNode root){
        if(root.right==null)
            return root;
        
        return findlastRight(root.right);
    }
}

// maine kara hai deletion 
// kaafi cases ho sakte hai iske 
// rotation bhi hai
// inorder predessocer (spelling galt hai haa) aur successor ka use karke hoga
// 10 m in break susu
// back to work
