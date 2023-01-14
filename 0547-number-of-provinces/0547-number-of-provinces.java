class Solution {
    public int findCircleNum(int[][] isConnected) {
       boolean vis[]=new boolean[isConnected.length];
        int count=0;
        
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                count++;
                dfs(vis,i,isConnected);
                
            }
        }
        return count;
    }
    
    void dfs(boolean vis[],int n,int [][]isConnected){
        vis[n]=true;
        
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i] && isConnected[n][i]==1){
                dfs(vis,i,isConnected);
            }
        }
    }
}