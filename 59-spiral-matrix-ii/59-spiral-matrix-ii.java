class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int top=0,left=0,right=n-1,bottom=n-1;
        int counter=0;
        
        while(counter<n*n){
            for(int i=left;i<=right;i++){
                counter++;
                arr[top][i]=counter;
            }
            top++;
              for(int i=top;i<=bottom;i++){
                counter++;
                arr[i][right]=counter;
            }right--;
              for(int i=right;i>=left;i--){
                counter++;
                arr[bottom][i]=counter;
            }bottom--;
              for(int i=bottom;i>=top;i--){
                counter++;
                arr[i][left]=counter;
            }left++;
        }
        return arr;
    }
}