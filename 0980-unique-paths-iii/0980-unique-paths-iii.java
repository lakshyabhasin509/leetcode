class Solution {
    public int uniquePathsIII(int[][] grid) {
        
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=-1 && grid[i][j]!=2){
                   count++;
                }
            }
        }
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return solve(grid,i,j,count);
                }
            }
        }
    return 0;}
    
    int solve(int [][]grid,int row,int col,int count){
        if(!(row>=0 && row<grid.length && col<grid[0].length&& col>=0))return 0;
        if(grid[row][col]==2){
            if(count==0)return 1;
            else return 0;
        }
        if(grid[row][col]==-1)return 0;
        
        int val=grid[row][col];
        grid[row][col]=-1;
        
        int ans=0;
        ans+=solve(grid,row+1,col,count-1);
        ans+=solve(grid,row,col+1,count-1);
        ans+=solve(grid,row-1,col,count-1);
        ans+=solve(grid,row,col-1,count-1);
        
        grid[row][col]=val;
        return ans;
        
    }
}