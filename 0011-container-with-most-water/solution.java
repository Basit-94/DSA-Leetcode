class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,t,max=0;
        while(l<r)
        {
            t = Math.min(height[l],height[r])*(r-l);
            if(max<t)
            {
                max = t;
            }
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return max;
    }
}
