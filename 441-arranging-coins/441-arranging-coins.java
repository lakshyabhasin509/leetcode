class Solution {
    public int arrangeCoins(int n) {
         int start=1;
        int end=n;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            long ans=(long)  mid*(mid+1)/2;
            
            if(ans>n)end=mid-1;
            else if(ans<n)start=mid+1;
            else return mid;
            
        }
        return end;
    }
}