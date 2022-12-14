class Solution {
    int dp[];
    public int rob(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helpRobber(nums,0);
    }
    public int helpRobber(int nums[],int i){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int take=helpRobber(nums,i+2)+nums[i];
        int notake=helpRobber(nums,i+1);
        
        return dp[i]=Math.max(take,notake);
    }
}