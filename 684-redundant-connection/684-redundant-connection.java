class Solution {
    int parent[];
    int size[];

    void make(int v){
        parent[v]=v;
        size[v]=1;
    }
    
    int find(int v){
        if(v==parent[v])return v;
    return find(parent[v]);
    }
  
    boolean union(int a,int b){
        a=find(a);
        b=find(b);
        if(a!=b){
             if(size[a]<size[b]){
                parent[a]=b;
                size[b]+=size[a];
            }
            else {
            parent[b]=a;
            size[a]+=size[b];
        }
        
            return true;
        }
        return false;
    }
    
    public int[] findRedundantConnection(int[][] edges) {
        
        parent=new int[edges.length+1];
        size=new int[edges.length+1];
        
        int rows=edges.length,cols=edges[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                make(edges[i][j]);
        }
        }
        int ans[]=new int[2];
        for(int i=0;i<rows;i++){
            if(!union(edges[i][0],edges[i][1])){
                ans[0]=edges[i][0];
                ans[1]=edges[i][1];
            }
        }
        return ans;
        
    }
}











