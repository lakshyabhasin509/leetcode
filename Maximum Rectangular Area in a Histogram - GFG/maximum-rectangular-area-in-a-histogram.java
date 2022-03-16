// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    
    
   static class Pair{
        int index;
       long val;

        public Pair() {
        }

        public Pair(int i, long val){
            this.index=i;
            this.val=val;
        }}







    public static long getMaxArea(long hist[], long n) {

       long max;

       long right[]=new long[hist.length];
       long left[]=new long[hist.length];

// Nearest Smaller to right
        Stack<Pair> stack=new Stack<>();
        for (int j = hist.length-1; j >=0; j--) {

           long ans;
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
        // smaller to left
   stack=new Stack<>();
        for (int j = 0; j < hist.length; j++) {

            long ans;
            if (stack.isEmpty()) {
                ans =-1;
            } else {
                if (stack.peek().val < hist[j])
                    ans = stack.peek().index;
                else {
                    while (!stack.isEmpty() && stack.peek().val >= hist[j]) {
                        stack.pop();

                    }
                    if (stack.isEmpty()) ans =-1;
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
        for (long l : hist) {
            if (l > max) max = l;
        }




    return max;}
        
}



