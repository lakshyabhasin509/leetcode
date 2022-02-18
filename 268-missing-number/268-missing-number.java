class Solution {
    public int missingNumber(int[] arr) {
    
       
      int i=0;
        while(i<arr.length){

           
            int correct=arr[i];
            if(arr[i]<arr.length&&arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;

            }else i++;
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i)
                return i;
        }
     return arr.length;   
    }
}