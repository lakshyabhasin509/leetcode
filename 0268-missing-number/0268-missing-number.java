class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
       while(i<nums.length){
           int rightIndex=nums[i];
           
           if(rightIndex!=nums.length && rightIndex!=i){
               int temp=nums[i];
               nums[i]=nums[rightIndex];
               nums[rightIndex]=temp;
           }else i++;
       }
        
        for( i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}