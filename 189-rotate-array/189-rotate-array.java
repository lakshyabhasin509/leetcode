class Solution {
    public void rotate(int[] nums, int k) {
        k=k % nums.length;
        rotateIndexWise(nums,0,nums.length-1);
        rotateIndexWise(nums,0,k-1);
        rotateIndexWise(nums,k,nums.length-1);
     
             }
    
    public void rotateIndexWise(int[] arr, int start, int end)
{
 
    while(start < end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        ++ start;
        --end;
    }
    
    
}
         }

    
    
    
