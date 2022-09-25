
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int [][]Matrix=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                Matrix[i][j]=Integer.parseInt(String.valueOf(matrix[i][j]));
            }
        }
        return maxArea(Matrix);
    }
        int maxArea(int[][] Matrix){
            int max=0;

            int[] temp=new int[Matrix[0].length];
            for (int i = 0; i < Matrix[0].length; i++) {
                temp[i]=Matrix[0][i];
            }
            max=MaxAreaHistogram.getMaxArea(temp,temp.length);
            for (int i = 1; i < Matrix.length; i++) {
                for (int j = 0; j < Matrix[i].length; j++) {
                    if(Matrix[i][j]==0){
                        temp[j]=0;
                    }
                    else
                        temp[j]=temp[j]+Matrix[i][j];
                }
                max=Math.max(max,MaxAreaHistogram.getMaxArea(temp,temp.length));


            }

            return max;
        }
    

}   
public class MaxAreaHistogram {
   static class Pair{
        int index;
       long val;

        public Pair() {
        }

        public Pair(int i, long val){
            this.index=i;
            this.val=val;
        }}







    public static int getMaxArea(int hist[], int n) {

       int max;

       int right[]=new int[hist.length];
       int left[]=new int[hist.length];

// Nearest Smaller to right
        Stack<Pair> stack=new Stack<>();
        for (int j = hist.length-1; j >=0; j--) {

           int ans;
            if (stack.isEmpty()) {
                ans = hist.length;
            } else {
                if (stack.peek().val < hist[j])
                    ans = stack.peek().index;
                else {
                    while (!stack.isEmpty() && stack.peek().val >= hist[j]) {
                        stack.pop();

                    }
                    if (stack.isEmpty()) ans = hist.length;
                    else ans = stack.peek().index;
                }
            }
            stack.push(new Pair(j, hist[j]));
            right[j] = ans;

        }
   stack=new Stack<>();
        for (int j = 0; j < hist.length; j++) {

            int ans;
            if (stack.isEmpty()) {
                ans = -1;
            } else {
                if (stack.peek().val < hist[j])
                    ans = stack.peek().index;
                else {
                    while (!stack.isEmpty() && stack.peek().val >= hist[j]) {
                        stack.pop();

                    }
                    if (stack.isEmpty()) ans = -1;
                    else ans = stack.peek().index;
                }
            }
            stack.push(new Pair(j, hist[j]));
            left[j] = ans;

        }
int area[]=new int[hist.length];
        for (int i = 0; i < hist.length; i++) {
            area[i]=hist[i]*((right[i]-left[i])-1);
        }
        max=area[0];
        for (int l : area) {
            if (l > max) max = l;
        }




    return max;}
}
