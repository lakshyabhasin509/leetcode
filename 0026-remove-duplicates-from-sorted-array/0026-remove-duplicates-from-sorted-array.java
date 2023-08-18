class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[ind]){
                ind=i;
                count++;
                nums[count]=nums[ind];
            }
        }
        return count+1;
    }
}