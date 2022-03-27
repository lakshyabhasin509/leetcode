class Solution {
  
    public int largestRectangleArea(int[] heights) {
 
        return getMaxArea(heights,heights.length);
    }
    
    
    class Pair{
        int index;
       long val;

        public Pair() {
        }

        public Pair(int i, long val){
            this.index=i;
            this.val=val;
        }}







    public int getMaxArea(int hist[], int n) {

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
        for (int i = 0; i < hist.length; i++) {
            hist[i]=hist[i]*((right[i]-left[i])-1);
        }
        max=hist[0];
        for (int l : hist) {
            if (l > max) max = l;
        }




    return max;}
}   
   