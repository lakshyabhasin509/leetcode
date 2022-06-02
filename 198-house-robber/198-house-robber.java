class Solution {
    int dp[];
    
    public int rob(int[] nums) {
        dp=new int[nums.length];
        dp[0]=nums[0];
        return solve(nums,nums.length);
   
}
    int solve(int[]arr,int n){
      
        for(int i=1;i<n;i++){
           int accept=arr[i];
            if(i>=2)
             accept=dp[i-2]+arr[i];
            int reject=dp[i-1];
            
            dp[i]=Math.max(accept,reject);
            
        }
        return dp[n-1];
    }
    
}