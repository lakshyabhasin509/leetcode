class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        if(source==destination)return true;
        boolean vis[]=new boolean[n];
        
        for(int i=0;i<edges.length;i++){
           addEdge(edges[i][0],edges[i][1],adj);
        }
        return dfs(source,adj,destination,vis);
    }
    void addEdge(int u,int v,ArrayList<ArrayList<Integer>> adj ){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    boolean dfs(int node,ArrayList<ArrayList<Integer>> ad,int destination,boolean[] vis){
        vis[node]=true;
        
        for(int i:ad.get(node)){
            if(i==destination)return true;
            if(!vis[i]){
               if(dfs(i,ad,destination,vis))return true;
            }
        }
        return false;
        
    }
}