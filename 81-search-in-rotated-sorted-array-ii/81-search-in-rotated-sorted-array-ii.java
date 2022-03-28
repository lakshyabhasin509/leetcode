class Solution {
    
public boolean search(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }
    public boolean search(int[] nums,int target,int start,int end){
        if(start>end)return false;
        if(nums[start]==nums[end]){
            if(nums[start]==target)
                return true;
            return search(nums,target,start+1,end-1);
        }
        int mid=start+(end-start)/2;
        
        if(nums[mid]==target)return true;
        if(nums[mid]>=nums[start])
        {
            if(target>=nums[start] && target<=nums[mid])
                return search(nums,target,start,mid-1);
            else return search(nums,target,mid+1,end);
        }
        if(target>=nums[mid]&& target<=nums[end])
            return search(nums,target,mid+1,end);
        
        
         return search(nums,target,start,mid-1);
    }}