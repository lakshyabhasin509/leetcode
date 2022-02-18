class Solution {
    public int[] findErrorNums(int[] arr) {
        int []nums={-1,-1};
        
         int i=0;
        while(i<arr.length){

            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;

            }else i++;
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1)
            {
                nums[0]=arr[i];
                nums[1]=i+1;
            }
        }
        return nums;
    }
}