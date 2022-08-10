class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(manager[i]==-1)continue;
            
            list.get(manager[i]).add(i);
        }
        
        int ans=dfs(headID,manager,informTime,list);
        return ans;
      
}
    int dfs(int node,int[] manager, int[] informTime,ArrayList<ArrayList<Integer>> list){
        if(informTime[node]==0)return 0;
        
        int ans=0;
        for(int i:list.get(node)){
            ans=Math.max(ans,dfs(i,manager,informTime,list));
        }
        
        return informTime[node]+ans;
    }
}
