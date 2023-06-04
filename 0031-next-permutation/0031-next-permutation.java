class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n-1);
            return;
        }
        // int min=Integer.MAX_VALUE;
        int minInd=-1;
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind] ){
                minInd=i;
                break;
            }
        }
        int temp=nums[minInd];
            nums[minInd]=nums[ind];
            nums[ind]=temp;
        
        reverse(nums,ind+1,n-1);
    }
    
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            end--;
            start++;
        }
    }
}