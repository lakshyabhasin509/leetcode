class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    if(!isPlaced(board,i,j))return false;
                }
            }
        }
        return true;
    }
    boolean isPlaced(char[][] board,int row,int col){
        int boxr=row - row%3;
        int boxc=col - col%3;
        
        for(int i=0;i<9;i++){
            if(i!=row && board[i][col]==board[row][col])return false;
        }
        for(int i=0;i<9;i++){
            if(i!=col && board[row][i]==board[row][col])return false;
        }
        
        for(int i=boxr;i<boxr+3;i++){
            for(int j=boxc;j<boxc+3;j++){
                if(!(i==row && j==col)){
                    if(board[i][j]==board[row][col])return false;
                }
            }
        }
        return true;
        
        
    }
    
}