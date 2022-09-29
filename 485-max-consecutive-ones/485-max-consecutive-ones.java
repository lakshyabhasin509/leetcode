class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            
                   if(nums[i]!=1)count=0;
            else count++;
            
            if(count>maxCount)maxCount=count;
        }
        return maxCount;
    }
}