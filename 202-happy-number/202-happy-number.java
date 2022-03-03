class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        
        
        do{
            slow=SquareOfDigits(slow);
            fast=SquareOfDigits(SquareOfDigits(fast));
        }while(slow!=fast);
        if(slow==1)return true;
        else return false;
    }

    int SquareOfDigits(int n){
        int ans=0;
        while(n!=0){
            int d=n%10;
            n=n/10;
            ans=ans+d*d;
            
                
        }
        return ans;
    }
    
}