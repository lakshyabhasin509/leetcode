class Solution {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int alicesum=0;
        int bobsum=0;
        int []share={-1,-1};
        for(int i=0;i<alice.length;i++){
        alicesum+=alice[i];
        }
        for(int i=0;i<bob.length;i++){
        bobsum+=bob[i];
        }
        for(int i=0;i<alice.length;i++){
            
        for(int j=0;j<bob.length;j++){
            int swappedalicesum=(alicesum-alice[i])+bob[j];
                int swappedbobsum=(bobsum-bob[j])+alice[i];
            if(swappedalicesum==swappedbobsum){
                share[0]=alice[i];
                share[1]=bob[j];
                return share;
            }
        }}
        
        return share;
    }
}