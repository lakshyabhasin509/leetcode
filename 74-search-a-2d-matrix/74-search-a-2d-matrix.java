class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int Rstart=0;
        int Rend=matrix.length-1;
        int col=matrix[0].length-1;
      
        while(Rstart<=Rend){

            int Rmid=Rstart+(Rend-Rstart)/2;
            if(matrix[Rmid][0]>target){
                Rend=Rmid-1;
            }
            else if(matrix[Rmid][col]<target){
                Rstart=Rmid+1;
            }
            else if((matrix[Rmid][0]<=target)&&(matrix[Rmid][col]>=target))
                return Binarysearch(matrix,Rmid,target);
        }
        return false;
    }
    boolean Binarysearch(int [][]matrix,int Row,int target){
        int start=0;
        int end=matrix[0].length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[Row][mid]>target)
                end=mid-1;
            else if(matrix[Row][mid]<target)
                start=mid+1;
            else return true;
        }
        return false;
    }
}