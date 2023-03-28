class Solution {
    int index=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
           
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add((prerequisites[i][1]));
        }
        boolean vis[]=new boolean[numCourses];
        int ans[]=new int[numCourses];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,ans,set))return new int[]{};
            }
        }
        
        return ans;
    }
    
    public boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean vis[],int ans[],HashSet<Integer> set){
        vis[node]=true;
        set.add(node);
        for(int i:adj.get(node)){
            if(!vis[i]){
                if(dfs(i,adj,vis,ans,set))return true;
            }
            else if(set.contains(i))return true;
        }
        
        ans[index++]=node;
        set.remove(node);
        return false;
    }
}