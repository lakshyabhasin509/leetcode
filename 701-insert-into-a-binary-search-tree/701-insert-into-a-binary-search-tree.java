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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode ptr=root;
        
        if(root==null) return root=new TreeNode(val);
        
    
        
        
        while(true){
            if(root.val<=val){
                if(root.right!=null) root=root.right;
                else {
                    root.right=new TreeNode(val);
                    break;
                }
                 }
                else {
                    if(root.left!=null) root= root.left;
                    else {
                        root.left=new TreeNode(val);
                        break;
                    }
                }
           
        }
        
        return ptr;
}
}
   // tried this but chala nahi (recursion se koshish kar raha tha mai)
// lets try iteration