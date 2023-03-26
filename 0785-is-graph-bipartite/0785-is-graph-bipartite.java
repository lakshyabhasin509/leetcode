class Solution {
    public boolean isBipartite(int[][] graph) {
        int vis[]=new int[graph.length];
        
        for(int i=0;i<graph.length;i++){
            if(vis[i]==0){
                if(!dfs(graph,-1,vis,i))return false;
            }
        }
        
        return true;
    }
    
    
    public boolean dfs(int [][]grid,int color,int []vis,int node){
        if(vis[node]!=0 && color==vis[node])return false;
        
        if(vis[node]!=0)return true;
        
        
        vis[node]=-color;
        
        for(int i:grid[node]){
            if(!dfs(grid,-color,vis,i))return false;
        }
        
        return true;
    }
}