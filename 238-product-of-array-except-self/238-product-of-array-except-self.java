class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int zeroCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zeroCount++;
            else product*=nums[i];
        }
        if(zeroCount>=2)return new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(zeroCount==1){
                if(nums[i]==0)nums[i]=product;
                else nums[i]=0;
            }
            else {
                nums[i]=product/nums[i];
            }
        }
        return nums;
    }
}