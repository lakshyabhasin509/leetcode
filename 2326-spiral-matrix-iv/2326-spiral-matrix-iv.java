/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
               int [][]matrix =new int[m][n];
       for(int[]i:matrix)
        Arrays.fill(i,-1);
        int top=0,down=matrix.length-1,left=0,right=matrix[0].length-1;

        while(head!=null){
            for(int i=left;i<=right && head!=null;i++){
                matrix[top][i]=head.val;
                head=head.next;
            }top++;
            for(int i=top;i<=down&& head!=null;i++){
                matrix[i][right]=head.val;
                head=head.next;
            }right--;
            for(int i=right;i>=left&& head!=null;i--){
                matrix[down][i]=head.val;
                head=head.next;

            }down--;
            for(int i=down;i>=top&& head!=null;i--){
                matrix[i][left]=head.val;
                head=head.next;

            }left++;
        }
        return matrix;
    }
}