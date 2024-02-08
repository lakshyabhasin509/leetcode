class Solution {
    
    
    int mem[];
    
    public int numSquares(int n){
        mem=new int[n+1];
        Arrays.fill(mem,-1);
        
        return solve(n);
        
    }
    public int solve(int n) {
        if(n==0)return 0;
        if(n<0)return Integer.MAX_VALUE-1;
        
        if(mem[n]!=-1)return mem[n];
        int ans=Integer.MAX_VALUE-1;
        
        for(int i=1;i*i<=n;i++)
        ans=Math.min(ans,1+solve(n-(i*i)));
        
        
        mem[n]=ans;
        return ans;
        
        
        
        
    }
}