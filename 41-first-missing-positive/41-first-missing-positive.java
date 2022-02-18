class Solution {
    public int firstMissingPositive(int[] arr) {
    int i=0;
        while(i<arr.length){

            if(arr[i]<1 || arr[i]>arr.length)
            {
                i++;
                continue;
            }
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;

            }else i++;
        }
        
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1)
                return i+1;
        }
        return arr.length+1;
    }
}