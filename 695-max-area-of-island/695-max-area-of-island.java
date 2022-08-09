class Solution {    
    public int maxAreaOfIsland(int[][] grid) {
        
        int row=grid.length,col=grid[0].length;
        boolean vis[][]=new boolean[row][col];
        int area=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1 && !vis[i][j] ){
                   int ans= dfs(i,j,vis,grid);
                    area=Math.max(area,ans);
                }
            }
        }return area;
    }
    
    int dfs(int row,int col,boolean vis[][],int [][]grid){
        if(row<0 || col<0||row>=grid.length || col>=grid[0].length)return 0 ;
        if(grid[row][col]==0)return 0;
        if(vis[row][col])return 0;
        
        
        vis[row][col]=true;
        
        
        int left=dfs(row+1,col,vis,grid);
        int right=dfs(row-1,col,vis,grid);
       int up= dfs(row,col-1,vis,grid);
       int down= dfs(row,col+1,vis,grid);
        
        return 1+left+right+up+down;
       
    }
    
}