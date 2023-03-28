class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
//         form an adjacency list
        
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add((prerequisites[i][1]));
        }
        boolean vis[]=new boolean[numCourses];
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<numCourses;i++){
            
            // System.out.println(adj.get(i));
            if(!vis[i]){
              if(dfs(i,adj,vis,set))return false;
            }
        }
        return true;
    }
    
    public boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean vis[],HashSet<Integer> set){
        vis[node]=true;
        set.add(node);
        
        for(int i:adj.get(node)){
            if(!vis[i]){
                if(dfs(i,adj,vis,set))return true;
            }
            
            else if(set.contains(i))return true;
        }
        set.remove(node);
        return false;
    }
}