class Solution {
    public int mySqrt(int x) {
       long start=1;
        long end=Integer.MAX_VALUE;
        long sqrt=1;
        if(x==0)
        return 0;
        while(start<=end){
            long mid=(start+end)/2;
          if(mid*mid<=x)
            {
                start=mid+1;
                sqrt=mid;}
            else end=mid-1;
        }
        
    return (int)sqrt;
    }
}
// binary search approach