class Solution {
    public int lastRemaining(int n) {
        boolean left=true;
        int head=1;
        int steps=1;
        int remain=n;
        while(remain>1){
            if(left || remain%2==1){
                head=head+steps;
            }
            
            remain=remain/2;
            steps=steps*2;
            left=!left;
            
            
        }
        
        return head;
    }
}