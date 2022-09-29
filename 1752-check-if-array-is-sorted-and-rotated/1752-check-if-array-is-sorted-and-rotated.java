class Solution {
    public boolean check(int[] nums) {
        if(nums[0]>nums[nums.length-1]){
            int count=0;
            for(int i =1;i<nums.length;i++){
                if(nums[i-1]>nums[i])count++;
            }
            if(count==1)return true;
        }
    else if(nums[0]==nums[nums.length-1]){
         int count=0;
            for(int i =1;i<nums.length;i++){
                if(nums[i-1]>nums[i])count++;
            }
            if(count<=1)return true;
        else return false;
    }
        
        else {
            int count=0;
            for(int i =1;i<nums.length;i++){
                if(nums[i-1]>nums[i])return false;
            }
            return true;
            
        }
        return false;
    }
}