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
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double> list=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();

        q.add(root);
        while(!q.isEmpty()){
           long sum=0;

            int len=q.size();
            for(int i=0;i<len;i++){


                if(q.peek().left!=null) {
                    q.add(q.peek().left);
                }if(q.peek().right!=null)
                    q.add(q.peek().right);
                sum+=q.remove().val;
            }
            
        
            double avg=(double)sum/len;
            list.add(avg);
        }
        return list;
    }
}