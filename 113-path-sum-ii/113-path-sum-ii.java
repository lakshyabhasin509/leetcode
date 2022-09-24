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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(root,targetSum,list,temp);
        return list;
    }
    
    public void solve(TreeNode root, int targetSum, List<List<Integer>> list,List<Integer> temp){
        if(root==null)return;
        if(targetSum ==root.val && root.left==null && root.right==null){
            temp=new ArrayList<>(temp);
            temp.add(root.val);
            list.add(temp);
            return;
        }
        
      
            
      
        
        
           temp.add(root.val);
        
           List<Integer> t=new ArrayList<>(temp);
        List<Integer> te=new ArrayList<>(temp);
            
        
            solve(root.left,targetSum-root.val,list,t);
            solve(root.right,targetSum-root.val,list,te);
       
           
        
        return;
    }
}