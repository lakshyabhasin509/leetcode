class Solution {
    public boolean checkIfExist(int[] arr) {
        
    Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            
                int search=BS(arr,(arr[i]*2));
            if(search!=-1 && search!=i)
                return true;
          
            
        }
        return false;
    }
    
    
    int BS(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
    
            if(arr[mid]<key)
                start=mid+1;
            else if(arr[mid]>key)
                end=mid-1;
            else return mid;
        }
        return -1;
    }



}