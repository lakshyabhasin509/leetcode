class Solution {
   
    
    public int climbStairs(int n) {
         int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++)dp[i]=-1;
        return solve(n,dp);
    }
    public int solve(int n,int []dp){
        if(n==0)return dp[n]= 1;
        if(n<0)return 0;
            
        if(dp[n]!=-1)return dp[n];
        
        return dp[n]= solve(n-1,dp)+solve(n-2,dp);
    }
}