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
    public int pathSum(TreeNode root, int targetSum) {
        return count(root,targetSum,new ArrayList<Integer>());
        
    }
    public int count(TreeNode root,int targetSum,List<Integer> list){
        if(root==null)return 0;
        
        list.add(root.val);
        int sum=0;
        int count=0;
        int size=list.size();
        for(int i=size-1;i>=0;i--){
            sum+=list.get(i);
            if(sum==targetSum)
                count++;
        }
        int left=count(root.left,targetSum,list);
       
        int right=count(root.right,targetSum,list);
         list.remove(list.size()-1);
        return left+right+count;
    }
}