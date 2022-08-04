class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows=heights.length;
        int cols=heights[0].length;
        
        boolean canPacific[][]=new boolean[rows][cols];
         boolean canAtlantic[][]=new boolean[rows][cols];
        
        
        
        for(int i=0;i<cols;i++)
        {
        dfs(0,i,canPacific,heights,heights[0][i]);
        dfs(rows-1,i,canAtlantic,heights,heights[rows-1][i]);
        }
        for(int i=0;i<rows;i++){
        dfs(i,0,canPacific,heights,heights[i][0]);
        dfs(i,cols-1,canAtlantic,heights,heights[i][cols-1]);
        }
        
        List<List<Integer>> ans=new ArrayList<>();
        
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(canPacific[i][j] && canAtlantic[i][j]){
                    List<Integer> index=new ArrayList<>();
                    index.add(i);
                    index.add(j);
                    ans.add(index);
                }
                }
            }
        
    
    return ans;}
        
        
    
    void dfs(int r,int c,boolean[][] canReach,int[][] heights,int prevHeight){
        
        if( r==heights.length || c== heights[0].length || r<0 ||c<0 || heights[r][c]<prevHeight) return; 
       
        if(canReach[r][c])return;
        
        
        canReach[r][c]=true;
        
        int height=heights[r][c];
        dfs(r,c-1,canReach,heights,height);
        dfs(r,c+1,canReach,heights,height);
       dfs(r+1,c,canReach,heights,height);
        dfs(r-1,c,canReach,heights,height);
    
        
    }
    }
    