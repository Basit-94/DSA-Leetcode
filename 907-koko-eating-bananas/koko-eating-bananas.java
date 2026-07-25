class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i=0;i<piles.length;i++)
        {
            if(max<piles[i])
            {
                max = piles[i];
            }
        }

        return binarysearch(piles,h,max);
    }
    int binarysearch(int piles[],int h,int right)
    {
        int left = 1,mid,ans=right;

        while(left<=right)
        {
            mid = left + (right-left)/2;

            long hr = hour(mid,piles);
            if(hr<=h)
            {
                right = mid-1;
                ans = mid;
            }
            else
            {
                left = mid+1;
            }
        }
        return ans;
    }
    long hour(int speed,int piles[])
    {
        long h=0;
        for(int i=0;i<piles.length;i++)
        {
            h = h + (piles[i]+speed-1)/speed;
        }

        return h;
    }
}