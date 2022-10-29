class Solution {
    
    List<List<String>> list;
    public List<List<String>> solveNQueens(int n) {
        list=new ArrayList<>();
        boolean dp[][]=new boolean[n][n];
        solve(dp,0);
        return list;
    }

   boolean solve(boolean board[][],int row){
        if(row==board.length){
        
            return true;
        }
        
        
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){

            board[row][col]=true;
           if(solve(board,row+1)){
               makeList(board);
           }
            board[row][col]=false;
            }
        }  
       
       return false;
    }
    
    boolean isSafe(boolean dp[][],int row,int col){
        for(int i=0;i<row;i++){
            if(dp[i][col])return false;
        }
        for(int i=row-1,j=col-1;i>=0 &&j>=0;i--,j--){
            if(dp[i][j])return false;
        }
         for(int i=row-1,j=col+1;i>=0 &&j<dp[0].length;i--,j++){
            if(dp[i][j])return false;
        }
        return true;
    }
    void makeList(boolean dp[][]){
        List<String> temp=new ArrayList<>();
        
        for(int i=0;i<dp.length;i++){
            String row="";
            for(int j=0;j<dp[0].length;j++){
                if(dp[i][j])
                    row+='Q';
                else row+='.';
            }
            temp.add(row);
        }
        
        list.add(temp);
    }
    
    
}