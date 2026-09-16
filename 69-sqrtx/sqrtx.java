class Solution {
    public int mySqrt(int x) {
        if(x==0)
        {
            return 0;
        }
        if(x<4)
        {
            return 1;
        }
        return (int)sqrt(x);
    }
    long sqrt(int x)
    {
        long l=0,h=x/2,m=(l+h)/2;
        while(l<=h)
        {
            if((long)m*m<x)
            {
                l = m+1;
            }
            else if((long)m*m>x)
            {
                h = m-1;
            }
            else
            {
                return m;
            }
            m = (l+h)/2;
        }
        return m;
    }
}