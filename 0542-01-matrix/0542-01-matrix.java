class Solution {
    
    public class Pair{
        int row;
        int col;
        int distance;
        
        Pair(int i,int j,int dist){
            row=i;
            col=j;
            distance=dist;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        boolean vis[][]=new boolean[mat.length][mat[0].length];
        Queue<Pair> qu=new ArrayDeque<>();
        
        int[][]ans=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    qu.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }
        
        int moves[][]={{0,1},{1,0},{-1,0},{0,-1}};
        while(!qu.isEmpty()){
            
            Pair item=qu.remove();
            ans[item.row][item.col]=item.distance;
            
            for(int i[]:moves){
                int r=item.row+i[0];
                int c=item.col+i[1];
                if(r>=0 && r<vis.length&&c<vis[0].length&&c>=0 && !vis[r][c]){
                qu.add(new Pair(r,c,item.distance+1));
                vis[r][c]=true;
                }
            }
            
            
            
        }
        return ans;
    }
    
    
}