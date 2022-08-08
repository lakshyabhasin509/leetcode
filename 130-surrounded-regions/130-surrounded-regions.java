class Solution {
    public void solve(char[][] board) {
        int rows=board.length;
        int cols=board[0].length;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || j==0 ||i==rows-1 ||j==cols-1){
                if(board[i][j]=='O'){
                    dfs(i,j,board);
            }}
            }
        }
      for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]=='O')board[i][j]='X';
                if(board[i][j]=='T')board[i][j]='O';
        }
        
    }}
    
    void dfs(int r,int c, char[][] board){
        if(r<0 || c<0 || r==board.length ||c==board[0].length || board[r][c]!='O')return;
        
        board[r][c]='T';
        dfs(r+1,c,board);
        dfs(r-1,c,board);
        dfs(r,c+1,board);
        dfs(r,c-1,board);
        
    }
}