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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
if(root==null)return list;
        int level=0;
        q.add(root);
        while(!q.isEmpty()){
            level++;
            List<Integer> temp=new ArrayList<>();

            Stack<Integer> stack=new Stack<>();
            int len=q.size();
            for(int i=0;i<len;i++){

                if(q.peek().left!=null)
                    q.add(q.peek().left);
                if(q.peek().right!=null)
                    q.add(q.peek().right);
                
                if(level%2==0)
                stack.add(q.remove().val);
                
                else temp.add(q.remove().val);
            }
     
                if(level%2==0)
                {
                    for(int i=0;i<len;i++)
                        temp.add(stack.pop());
                }
            
            list.add(temp);
        }
        return list; 
    }
}