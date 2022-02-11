class Solution {
    public boolean checkIfExist(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
            for(int j=0;j<arr.length;j++){
              if(arr[j]*2==arr[i] && j!=i){
                  System.out.println(arr[i]+" "+arr[j]);
                  return true;
            }}
        }
    }
        return false;
}}