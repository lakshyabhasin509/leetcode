class Solution {
public:
    int mySqrt(int x)
    {
       long int i=1;
    while(i*i<=x)
    {
        if(i*i==x)
        {
            return i;
            break;
        }
        i++;
    }
        return i-1;
    }
};