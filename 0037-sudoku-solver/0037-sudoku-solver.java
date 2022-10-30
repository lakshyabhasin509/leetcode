class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    
    
    
    boolean solve(char[][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                
                if(board[i][j]=='.'){
                    
                    
                    for(char ch='1';ch<='9';ch++){
                       
                        if(isPlaced(board,i,j,ch)){
                            board[i][j]=ch;
                           if(solve(board))return true;
                            else {
                                board[i][j]='.';
                            }
                        }}
    
                        return false;
                    }
                   
                }
            }
        
         return true;
    }
    
     boolean isPlaced(char[][] board,int row,int col,char ch){
        int boxr=row - row%3;
        int boxc=col - col%3;
        
        for(int i=0;i<9;i++){
            if(board[i][col]==ch)return false;
        }
        for(int i=0;i<9;i++){
            if(board[row][i]==ch)return false;
        }
        
        for(int i=boxr;i<boxr+3;i++){
            for(int j=boxc;j<boxc+3;j++){
                    if(board[i][j]==ch)return false;
                }
            }
        
        return true;
        
        
    }}
