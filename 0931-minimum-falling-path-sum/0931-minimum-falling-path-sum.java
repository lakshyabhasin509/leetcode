class Solution {
    
    int dp[][];
    public int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
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
        
        
        int down=minSumHelper(matrix,row+1,col);
        int diagonalRight=minSumHelper(matrix,row+1,col+1);
        int diagonalLeft=minSumHelper(matrix,row+1,col-1);
        
        return dp[row][col]= matrix[row][col]+Math.min(Math.min(down,diagonalRight),diagonalLeft);
    }
}