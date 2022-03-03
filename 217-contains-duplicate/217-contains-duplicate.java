class Solution {
    public boolean containsDuplicate(int[] nums) {
       int ans=0; 
       Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])return true;
          
        }
         return false;
        
    }
}