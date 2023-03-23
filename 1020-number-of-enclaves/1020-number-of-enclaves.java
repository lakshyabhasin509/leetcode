class Solution {
    public int numEnclaves(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        
        for(int i=0;i<row;i++ ){
            for(int j=0;j<col;j++){
                if(i==0 || j==0||i==row-1|| j==col-1){
                    if(grid[i][j]==1)dfs(i,j,grid);
                }
            }
        }
        int count=0;
        for(int i=0;i<row;i++ ){
            for(int j=0;j<col;j++){
                
                    if(grid[i][j]==1)count++;
              
            }
        }
        
        return count;
    }
    
    public void dfs(int i,int j,int[][] grid){
        if(i<0 || j<0||i>=grid.length||j>=grid[0].length)return ;
        if(grid[i][j]!=1)return;
        
        
        grid[i][j]=0;
        
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);

    }
}