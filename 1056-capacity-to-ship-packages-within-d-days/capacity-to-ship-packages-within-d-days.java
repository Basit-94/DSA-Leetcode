class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0,sum = 0;
        for(int i=0;i<weights.length;i++)
        {
            sum = sum + weights[i];
            if(max<weights[i])
            {
                max = weights[i];
            }
        }

        return binarysearch(weights,days,max,sum);
    }
    int binarysearch(int weights[],int days,int left,int right)
    {
        int mid = 0,ans = 0;

        while(left<=right)
        {
            mid = left + (right-left)/2;

            int d = day(weights,mid);
            if(d<=days)
            {
                ans = mid;
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return ans;
    }
    int day(int weights[],int mid)
    {
        int c=0,d=1;
        for(int i=0;i<weights.length;i++)
        {
            if(c+weights[i] <=mid)
            {
                c = c+weights[i];
            }
            else
            {
                d++;
                c = weights[i];
            }
        }
        return d;
    }
}