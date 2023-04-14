class Solution {
    
    class Pair{
        int x,y,distance;
        
        Pair(int x,int y,int d){
            this.x=x;
            this.y=y;
            distance=d;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<Pair> q=new ArrayDeque<>();
        int dis[][]=new int[grid.length][grid[0].length];
        for(int i[]:dis)
        Arrays.fill(i,Integer.MAX_VALUE);
       
        
        q.add(new Pair(0,0,1));
        if(grid[0][0]==1)return -1;
        dis[0][0]=1;
         if(grid.length==1)return 1;
        int dir[][]={{1,1},{-1,-1},{0,-1},{0,1},{-1,0},{1,0},{-1,1},{1,-1}};
        
        while(!q.isEmpty()){
            Pair elem=q.remove();
            int r=elem.x;
            int c=elem.y;
            
            int dist=elem.distance;
            System.out.println(r+""+c+""+dist);
            for(int i[]:dir){
                int row=r+i[0];
                int col=c+i[1];
                if(row>=0 && col>=0 && row<grid.length && col<grid[0].length){
                    if(grid[row][col]==0 && dis[row][col]>dist+1){
                        dis[row][col]=dist+1;
                        if(row==grid.length-1 && col==grid[0].length-1)return dist+1;
                        q.add(new Pair(row,col,dis[row][col]));
                }
                    // else if(grid[row][col]==1)dis[row][col]=-1;
            }
        }
        
      
    }
          return -1;
}}