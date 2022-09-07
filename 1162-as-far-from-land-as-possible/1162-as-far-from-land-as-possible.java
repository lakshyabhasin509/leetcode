class Solution {
    class Pair{
        int row;
        int col;
        
        Pair(int r,int c){
            row=r;
            col=c;
        }
    }
    Queue<Pair> q;
    public int maxDistance(int[][] grid) {
        q=new ArrayDeque<>();
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    vis[i][j]=true;
                    q.add(new Pair(i,j));
                }
            }
        }
        if(q.isEmpty())return -1;
        
        int count=0;
        while(!q.isEmpty()){
            int size=q.size();
            
            
        for(int k=0; k<size; k++){
                Pair p=q.remove();
            int i=p.row;
            int j=p.col;
            
            
            
            if(i+1<grid.length && !vis[i+1][j]){
                q.add(new Pair(i+1,j));
                vis[i+1][j]=true;
            }
             if(j+1<grid[0].length &&!vis[i][j+1] ){
             
            q.add(new Pair(i,j+1));
             vis[i][j+1]=true;
             }
            if( i-1>=0 && !vis[i-1][j]){
                
            vis[i-1][j]=true;
            q.add(new Pair(i-1,j));
            } if(j-1>=0 && !vis[i][j-1]){
                vis[i][j-1]=true;
            q.add(new Pair(i,j-1));
            }
            }
            
            count++;
        }
        if(count==1)return -1;
    return count-1;
}}