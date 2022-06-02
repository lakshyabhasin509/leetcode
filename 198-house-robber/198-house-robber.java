class Solution {
    int dp[];
    void memset(){
        for(int i=0;i<dp.length;i++)
            dp[i]=-1;
    }
    public int rob(int[] nums) {
        dp=new int[nums.length+1];
        memset();
        return solve(nums,nums.length-1);
   
}
    int solve(int[]arr,int n){
        if(n==0)return arr[n];
        if(n<0)return 0;
        
        if(dp[n]!=-1)return dp[n];
        int accept=solve(arr,n-2)+arr[n];
        int reject=solve(arr,n-1);
        
        return dp[n]= Math.max(accept,reject);
    }
    
}