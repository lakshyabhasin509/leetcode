class Solution {
    public int search(int[] nums, int target) {
    
        int pivot=FindPivot(nums);
if(pivot==-1)
{
    return BinarySearch(nums,target,0,nums.length-1);
    
}

        if(nums[pivot]==target)
            return pivot;
        if(nums[0]<=target)
            return BinarySearch(nums,target,0,pivot-1);
       return BinarySearch(nums,target,pivot+1,nums.length-1);

    }
int FindPivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if(mid <end &&arr[mid]>arr[mid+1])
                return mid;
            if(mid>start && arr[mid]<arr[mid-1])
                return mid;
            if(arr[mid]<=arr[start])
                end=mid-1;
              else start=mid+1  ;
         
                
            
            
        }
return -1;
    }
   int BinarySearch(int arr[],int key,int start,int end){
        int mid;

        while (start<=end){
            mid=start-((start-end)/2);
            if(arr[mid]==key)
                return mid;
            else if (arr[mid]<key)
                start=mid+1;
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}