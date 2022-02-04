class Solution {
    public int[] searchRange(int[] arr, int key) {
      int ans[]={-1,-1};
        ans[0]=helperFirstOrLast(arr,key,true);
        ans[1]=helperFirstOrLast(arr,key,false);
        
        return ans;
    
    
}
    
    int helperFirstOrLast(int[] arr, int key,boolean ifFirst){
   int ans=-1;
        int start=0;
        int end=arr.length-1;
        int mid;

        while (start<=end){
            mid=start-((start-end)/2);
            if(arr[mid]==key)
            {
                ans=mid;
                if(ifFirst)
                {
                    end=mid-1;
                    
                }
              else start=mid+1;  
            }
            else if (arr[mid]<key)
                start=mid+1;
            else{
                end=mid-1;
            }
        }
        
        return ans;
    }
}