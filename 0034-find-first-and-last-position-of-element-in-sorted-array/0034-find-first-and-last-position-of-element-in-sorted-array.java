class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int [2];
        ans[0]=binarySearch(nums,target,true);
        ans[1]=binarySearch(nums,target,false);
        return ans;
        
    }
    int binarySearch(int nums[],int target,boolean first){
          
        int start=0 ,end =nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(first){
                if(nums[start]==target)return start;
                if(nums[mid]==target){
                    ans=mid;
                    end=mid-1;
                }
            }
            if(!first)
            {
                if(nums[end]==target)return end;
                if(nums[mid]==target){
                    ans=mid;
                    start=mid+1;
                }
        }
            if(nums[mid]>target)end=mid-1;
            if(nums[mid]<target)start=mid+1;
    }
        return ans;
}}