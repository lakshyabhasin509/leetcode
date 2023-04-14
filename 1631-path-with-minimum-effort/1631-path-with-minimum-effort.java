class Solution {
    class Pair{
        int x,y,difference;
        Pair(int r,int c,int diff){
            x=r;
            y=c;
            difference=diff;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)->x.difference-y.difference);
        int n=heights.length;
        int m=heights[0].length;
        int dis[][]=new int[n][m];
        for(int i[]:dis){
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        pq.add(new Pair(0,0,0));
        dis[0][0]=0;
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        while(pq.size()>0){
            Pair elem=pq.remove();
            int row=elem.x;
            int col=elem.y;
            int diff=elem.difference;
            
            
            if(row==n-1 && col==m-1)return diff;
            for(int i[]:dir){
                int nrow=row+i[0];
                int ncol=col+i[1];
                
                if(nrow>=0 && ncol>=0 && ncol<m && nrow<n){
                    int newEffort=Math.max(Math.abs(heights[row][col]-heights[nrow][ncol]),diff);
                    if(dis[nrow][ncol]>newEffort){
                          dis[nrow][ncol]=newEffort;
                        pq.add(new Pair(nrow,ncol,newEffort));
                    }
                }
            }
        }
        return 0;
    }
}