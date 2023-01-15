class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][]=new boolean[image.length][image[0].length];
        
       int prevColor=image[sr][sc];
        solve(image,vis,sr,sc,prevColor,color);
        return image;
    }
    
    void solve(int[][] image,boolean vis[][], int sr, int sc, int prevColor,int newColor){

    if(sr<0 || sr>=image.length ||sc>=image[0].length||sc<0||vis[sr][sc]||image[sr][sc]!=prevColor)return ;
    
        vis[sr][sc]=true;
        image[sr][sc]=newColor;
    solve(image,vis,sr+1,sc,prevColor,newColor);
    solve(image,vis,sr,sc+1,prevColor,newColor);
    solve(image,vis,sr-1,sc,prevColor,newColor);
    solve(image,vis,sr,sc-1,prevColor,newColor);
        
        
    }
    
}