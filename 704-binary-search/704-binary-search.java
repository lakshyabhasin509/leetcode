class Solution {
    public int search(int[] nums, int target) {
       return BinarySearch(nums,target,0,nums.length-1);
    }
    int BinarySearch(int[] nums,int target,int start,int end){
        if(start>end)return -1;
        
        int mid=start+(end-start)/2;
        
        if(nums[mid]==target)return mid;
        else if(nums[mid]>target)
           return BinarySearch(nums,target,start,mid-1);
        else return BinarySearch(nums,target,mid+1,end);
        
       
    }
}