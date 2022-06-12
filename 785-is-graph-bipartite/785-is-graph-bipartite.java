class Solution {
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
    int vis[]=new int[V];
        Arrays.fill(vis,-1);

        for (int i = 0; i < V; i++) {
            if (vis[i]==-1) {
                if (!dfsHelp(i, vis,graph,0))return false;
            }
        }
return true;

    }
  static   boolean dfsHelp(int node,
                 int[] visited,
                 int[][] adj ,int color){
      
        visited[node]=color;

        for(int i : adj[node]){
            if(visited[i]==-1){
               if(!dfsHelp(i,visited,adj,color^1))return false;
            } else if (visited[i]==color) {
                return false;
            }
        }
return true;
}
}