class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp=new int[n];
        Arrays.fill(dp,-1);
      return solve(n);
        
    }
    
    public int solve(int n){
          if(n<0)return 0;
        if(n==0)return 1;
        
        
        if(dp[n-1]!=-1)return dp[n-1];
        
        return dp[n-1]=solve(n-1)+solve(n-2);
    }
}