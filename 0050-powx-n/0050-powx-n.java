class Solution {
    public double myPow(double x, int n) {
        long num=n;
       if(n < 0){
             num = (long)n;
           num=-num;
            x = 1 / x;
        }
        
        
      
        double pow = 1;
        
        while(num != 0){
            if((num & 1) != 0){
                pow *= x;
            } 
                System.out.println(num);
            x *= x;
           num >>= 1;
            
        }
        
        return pow;
    }
}