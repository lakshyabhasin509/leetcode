class Solution {
    public void solve(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        
        
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||j==0||i==row-1||j==col-1){
                    if(board[i][j]=='O')
                    dfs(board,i,j);
                }
            }
        }
        
          
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O')board[i][j]='X';
                if(board[i][j]=='T'){
                    board[i][j]='O';
                }
                
            }
        }
    }
    
    public void dfs(char[][] board,int i,int j){
        if(i<0 || j<0||i>=board.length||j>=board[0].length)return;
        if(board[i][j]!='O')return;
        
        board[i][j]='T';
        
        dfs(board,i+1,j);
        dfs(board,i,j+1);
        dfs(board,i-1,j);
        dfs(board,i,j-1);

    }
}