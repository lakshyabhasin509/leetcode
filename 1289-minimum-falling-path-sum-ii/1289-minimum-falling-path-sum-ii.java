
class Solution {
    
    int dp[][];
    public int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        
        if(matrix.length==1){
             for(int i=0;i<matrix[0].length;i++){
            min=Math.min(min,matrix[0][i]);
        }
            return min;
        }
        dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        
        for(int i=0;i<matrix[0].length;i++){
            min=Math.min(min,minSumHelper(matrix,0,i));
        }
        
        
        return min;
    }
    
    int minSumHelper(int [][]matrix,int row,int col){
        
                if(row==matrix.length)return 0;
        if(col<0 || row>=matrix.length||col>=matrix[0].length)return Integer.MAX_VALUE;
        
        if(dp[row][col]!=Integer.MAX_VALUE)return dp[row][col];
    int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            if(i!=col){
                min=Math.min(minSumHelper(matrix,row+1,i),min);
            }
        }
        
        return dp[row][col]= matrix[row][col]+min;
    }
}