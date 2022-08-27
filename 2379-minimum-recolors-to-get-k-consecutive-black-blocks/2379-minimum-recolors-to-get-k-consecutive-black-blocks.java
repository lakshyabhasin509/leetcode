class Solution {
    public int minimumRecolors(String blocks, int k) {
        int wCount=0;
        int bCount=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W')wCount++;
            else if(blocks.charAt(i)=='B')bCount++;
        }
        int start=0;
        if(wCount==0)return 0;
        int minW=wCount;
        
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(start)=='W')wCount--;
            if(blocks.charAt(start)=='B')bCount--;
            
            start++;
            
            if(blocks.charAt(i)=='W')wCount++;
            if(blocks.charAt(start)=='B')bCount++;

            minW=Math.min(wCount,minW);
            
        }
        
        return minW;
        
    }
}