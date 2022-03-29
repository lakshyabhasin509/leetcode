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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();

        Stack<List<Integer>> stack=new Stack<>();
        if(root==null)return list;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp=new ArrayList<>();

            int len=q.size();
            for(int i=0;i<len;i++){

                if(q.peek().left!=null)
                    q.add(q.peek().left);
                if(q.peek().right!=null)
                    q.add(q.peek().right);
                temp.add(q.remove().val);

            }
            stack.add(temp);
        }

        while(!stack.isEmpty())
            list.add(stack.pop());

        return list;

    }
}