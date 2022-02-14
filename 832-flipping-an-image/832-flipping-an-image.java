class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
    
        
        
        for(int i=0;i<image.length;i++){
             int a=0;
        int b=image.length-1;
            while(a<b){

                int temp=image[i][a];
                image[i][a]=image[i][b];
                image[i][b]=temp;
                a++;
                b--;
            }
            
        }
          
        for(int i=0;i<image.length;i++){
         for(int j=0;j<image.length;j++){
             image[i][j]=image[i][j]==1?0:1;
         }
            
        }
        return image;
    }
}