class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        
        int curSum=max;
        int i=1;
        while(i<nums.length){
            if(curSum<0)curSum=nums[i];
            else curSum+=nums[i];
            
            if(curSum>max)max=curSum;
            i++;
        }
        
        return max;
    }
    
    
}