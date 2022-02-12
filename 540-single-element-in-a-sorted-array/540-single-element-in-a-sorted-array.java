class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        // Using Binaty Search
     if(nums.length==1){

     return nums[0]; }
        
        
        int start=0;
        int end=nums.length-1;
        while(start<=end){
         
            
            if(nums[end]!=nums[end-1])
                return nums[end];
       
            
            if(nums[start]!=nums[start+1])
            return nums[start];
              int mid=start+(end-start)/2;
            
            
            
            
            
            
            if(nums[mid]<nums[mid+1] && nums[mid]>nums[mid-1]){
                return nums[mid];
            }
            
            if(nums[mid]==nums[mid+1])
            {
               if(mid%2==0)
                start=mid+2;
            else end=mid-1;
           
                
            }
             else if(nums[mid]==nums[mid-1])
            {
                if((mid-1)%2==0)
                    start=mid+1;
                 else end=mid-2;
            }
            
            
        }return -1;
        
    }
}