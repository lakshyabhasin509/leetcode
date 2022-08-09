class Solution {
    int count;
    
    public int maxAreaOfIsland(int[][] grid) {
        
        int row=grid.length,col=grid[0].length;
        boolean vis[][]=new boolean[row][col];
        int area=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1 && !vis[i][j] ){
                    count=0;
                    dfs(i,j,vis,grid);
                    if(area<count){
                        area=count;
                    }
                }
            }
        }return area;
    }
    
    void dfs(int row,int col,boolean vis[][],int [][]grid){
        if(row<0 || col<0||row>=grid.length || col>=grid[0].length)return;
        if(grid[row][col]==0)return;
        if(vis[row][col])return;
        
        
        vis[row][col]=true;
        count++;
        
        dfs(row+1,col,vis,grid);
        dfs(row-1,col,vis,grid);
        dfs(row,col-1,vis,grid);
        dfs(row,col+1,vis,grid);
       
    }
    
}