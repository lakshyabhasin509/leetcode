class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=0;
         var maxIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
           maxIndex=i;}
        }
        return maxIndex;
        
    }
}