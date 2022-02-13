class Solution {
    public int arrangeCoins(int n) {
        int blocks=1;
        int stairs=0;
        
        while(n>stairs){
            n=n-blocks;
            stairs++;
            blocks++;
        }
        return stairs;
    }
}